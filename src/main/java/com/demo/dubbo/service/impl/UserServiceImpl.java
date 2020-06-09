package com.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.service.UserService;
import org.apache.catalina.User;

/**
 * Created by chenxyz on 2020/6/9.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String login(String name) {
        System.out.println(name+" 登录成功！！！");
        return "success";
    }
}
