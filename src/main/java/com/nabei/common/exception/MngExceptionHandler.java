package com.nabei.common.exception;

import com.nabei.common.dto.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 16:46
 * @Description: 统一异常处理
 */
@ControllerAdvice
public class MngExceptionHandler {

    @ExceptionHandler(value = MngException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MngException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(e.getCode());
        r.setData(null);
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
