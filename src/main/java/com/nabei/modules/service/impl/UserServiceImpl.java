package com.nabei.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nabei.modules.entity.User;
import com.nabei.modules.mapper.UserMapper;
import com.nabei.modules.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 19:18
 * @Description:
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

}
