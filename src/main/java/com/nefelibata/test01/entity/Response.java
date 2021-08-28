package com.nefelibata.test01.entity;

public class Response {
    String msg;
    int code;
    Boolean isSuc = true;
    Object result;

    public Response(){

    }

    public Response(Boolean isSuc,String msg, int code) {
        this.msg = msg;
        this.code = code;
        this.isSuc = isSuc;
    }

    public Object getResult() {
        return result;
    }
    public void setResult(Object result) {
        this.result = result;
    }
    public Boolean getIsSuc() {
        return isSuc;
    }
    public void setIsSuc(Boolean isSuc) {
        this.isSuc = isSuc;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setResponse(Boolean isSuc,String msg, int code,Object result) {
        this.msg = msg;
        this.code = code;
        this.isSuc = isSuc;
        this.result = result;
    }

}
