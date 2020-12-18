package com.chen.entiey;

import java.util.List;

public class Common<T> {

    private Integer code;
    private String msg;
    private T data;
    private List<T> list;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Common{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", list=" + list +
                '}';
    }
}
