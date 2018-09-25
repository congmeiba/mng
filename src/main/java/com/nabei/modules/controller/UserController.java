package com.nabei.modules.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nabei.common.exception.MngException;
import com.nabei.common.utils.FaJsonUtils;
import com.nabei.common.utils.Response;
import com.nabei.modules.entity.User;
import com.nabei.modules.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 19:36
 * @Description:
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("insert")
    public Object insert(User user) throws MngException {
        int i;
        Response _response = null;
        try {
            boolean save = userService.save(user);
            if (save) {
                _response = Response.getSuccessResponse();
            }
        } catch (MngException e) {
            throw new MngException(e.getMessage());
        }
        return FaJsonUtils.objToString(_response);
    }


    @GetMapping("findByname")
    public Object findByName(@RequestParam("name") String name) throws MngException {
        Response _response = null;
        User user = null;
        try {
//            user = userService.findByName(name);
//            if(user != null){
//                _response = Response.getSuccessResponse(user);
//            }else {
//                _response = Response.getFailResponse();
//            }
        } catch (MngException e) {
            throw new MngException(e.getMessage());
        }
        return FaJsonUtils.objToString(_response);
    }

    /**
     * 分页演示
     * @return
     */
    @GetMapping("listr")
    public Object listr() {
        Response _response = null;
        //分页page
        Page<User> page = new Page<>(0,10);
        IPage iPage = userService.page(page, null);
        System.out.println(iPage.getTotal());
        List<User> list = iPage.getRecords();
        System.out.print(list.size());
        _response = Response.getSuccessResponse(iPage);
        return FaJsonUtils.objToString(_response);
    }


}
