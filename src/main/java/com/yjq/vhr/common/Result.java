package com.yjq.vhr.common;

public class Result {
    private Integer status;
    private String msg;
    private Object data;

    public static Result success(String msg) {
        return new Result(200, msg, null);
    }

    public static Result success(String msg, Object data) {
        return new Result(200, msg, data);
    }

    public static Result error(String msg) {
        return new Result(500, msg, null);
    }

    public static Result error(String msg, Object data) {
        return new Result(500, msg, data);
    }
    private Result() {
    }

    private Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
