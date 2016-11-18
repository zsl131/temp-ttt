package com.zslin.dto;

/**
 * Created by 钟述林 393156105@qq.com on 2016/11/18 21:33.
 */
public class ResDto {

    private String code;

    private String msg;

    public ResDto(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
