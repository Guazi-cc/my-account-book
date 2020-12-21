package com.chen;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBillApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test01() {
        String str = "dfdsdfdsfdsfdfddfdfabcd\nfdsfdfddfdfabcd    =1155";
        str = str.substring(0, str.indexOf("=")).trim();
        System.out.println(str);
    }

}
