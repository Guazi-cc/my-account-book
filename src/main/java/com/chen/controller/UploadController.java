package com.chen.controller;

import com.chen.entiey.AccountBook;
import com.chen.entiey.Common;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/source")
public class UploadController {

    private Common<AccountBook> accbRes = new Common<>();

    @PostMapping("/myUploadSource")
    @ResponseBody
    public Common<AccountBook> myUploadSource(@RequestParam("file") MultipartFile file , HttpServletRequest request) {
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        if(".txt".equals(suffix)) {
            try {
                List<AccountBook> accountBookList = analysisAccountBookFile(file.getInputStream());
                if (accountBookList != null) {
                    accbRes.setCode(200);
                    accbRes.setMsg("Oj8K");
                    accbRes.setList(accountBookList);
                } else {
                    accbRes.setCode(500);
                    accbRes.setMsg("读取文件出错");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            accbRes.setMsg("请传txt");
            accbRes.setCode(500);
        }
        return accbRes;
    }

    @GetMapping("/getInitData")
    @ResponseBody
    public Common<AccountBook> getInitData() {
        return new Common<>();
    }

    @GetMapping("/getData")
    @ResponseBody
    public Common<AccountBook> getData() {
        return accbRes;
    }

    /**
     * @Title: uploadSource
     * @Description: 文件上传，返回文件的存储路径
     * @param file
     * @return Object
     * @author hzp
     * @date 2019年5月6日下午9:51:16
     */
    @PostMapping("/uploadSource")
    @ResponseBody
    public String uploadSource(@RequestParam("file") MultipartFile file , HttpServletRequest request) {
        System.out.println(file);
        String pathString = null;
        if(file!=null) {
            pathString = "D:/upload/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" +file.getOriginalFilename();
        }

        try {
            File files=new File(pathString);
            //打印查看上传路径
            System.out.println(pathString);
            if(!files.getParentFile().exists()){
                files.getParentFile().mkdirs();
            }
            file.transferTo(files);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "{\"code\":0,\"msg\":\""+pathString+"\"}";
        /**
         * 这里需要注意的是，layUI文档规定了，返回值必须是json数据，并且有格式要求，具体格式如下：
         *
         {
            "code": 0
            ,"msg": ""
            ,"data": {
                "src": "http://cdn.layui.com/123.jpg"
            }
         }
         */
    }

    public static boolean isNumber(char c) {
        return c >= 48 && c <= 57 || c == 46;
    }

    public static boolean strIsNotNull(String str) {
        return str != null && !"".equals(str);
    }

    public List<AccountBook> analysisAccountBookFile(InputStream inputStream) {
        List<AccountBook> accountBookList = new ArrayList<>();
        try(InputStreamReader read = new InputStreamReader(inputStream, StandardCharsets.UTF_8.name())) {
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt;
            Integer lineCount = 0;      //记录行数
            while((lineTxt = bufferedReader.readLine()) != null){
                lineCount += 1;
                if(lineCount != 1){     // 跳过第一行
                    lineTxt = lineTxt.contains("=") ? lineTxt.substring(0, lineTxt.indexOf("=")).trim() : lineTxt;
                    String[] aa = lineTxt.split("/");
                    for (int i = 1; i < aa.length; i++) {
                        AccountBook accountBook = new AccountBook();
                        accountBook.setChDay(aa[0]);
                        String str1 = aa[i].trim();
                        if(strIsNotNull(str1)) {
                            for (int j = str1.length()-1; j >= 0; j--) {
                                if(!isNumber(str1.charAt(j))) {
                                    String substr = str1.substring(j+1, str1.length());
                                    if(str1.charAt(j)==43){     //若是 “+” 则为收入
                                        accountBook.setIncomeNm(str1.substring(0, j));
                                        accountBook.setIncome(Double.parseDouble(substr));
                                        break;
                                    } else {                    //否则支出
                                        accountBook.setOutcomeNm(str1.substring(0, j+1));
                                        accountBook.setOutcome(Double.valueOf(substr));
                                        break;
                                    }
                                }
                            }
                        }
                        accountBookList.add(accountBook);
                    }
                }
            }
            accountBookList.forEach(System.out::println);
            return accountBookList;
        } catch (Exception e) {
            System.err.println("读取文件内容出错");
            e.printStackTrace();
            return null;
        }
    }


}
