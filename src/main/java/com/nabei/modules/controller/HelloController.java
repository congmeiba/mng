package com.nabei.modules.controller;

import com.nabei.common.exception.MngException;
import com.nabei.common.utils.FaJsonUtils;
import com.nabei.common.utils.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 16:08
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/index")
    public Object index() throws MngException{
        Response _response = null;
        try {
            _response = Response.getSuccessResponse();
        }catch (Exception e){
            _response = Response.getFailResponse();
            throw new MngException(e.getMessage());
        }
        return FaJsonUtils.objToString(_response);
    }

}
