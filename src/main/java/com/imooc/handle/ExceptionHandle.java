package com.imooc.handle;

import com.imooc.domain.Result;
import com.imooc.exception.GirlException;
import com.imooc.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * 捕获GirlException异常
     * 启动应用后，被 @ExceptionHandler、@InitBinder、@ModelAttribute 注解的方法，都会作用在被 @RequestMapping 注解的方法上。
     * @param ge
     * @return
     */

    @ExceptionHandler(value = GirlException.class)
    @ResponseBody
    public Result girlHandle(GirlException ge) {
        return ResultUtil.error(ge.getCode(), ge.getMessage());
    }

    /**
     * 捕获全局异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        logger.error("[系统异常]");
        return ResultUtil.error(-1, "未知错误");
    }
}
