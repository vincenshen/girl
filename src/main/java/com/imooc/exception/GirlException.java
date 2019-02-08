package com.imooc.exception;


import com.imooc.enums.ResultEnum;

/**
 * GirlException包含两个字段： code 和 message (message继承至RuntimeException)
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }
}
