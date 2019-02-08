package com.imooc.utils;

import com.imooc.domain.Girl;
import com.imooc.domain.Result;

public class ResultUtil {

    public static Result success(Girl girl){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("Success");
        result.setData(girl);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
