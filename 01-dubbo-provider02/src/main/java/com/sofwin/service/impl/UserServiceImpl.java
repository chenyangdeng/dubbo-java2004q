package com.sofwin.service.impl;

import com.sofwin.service.UserService;

public class UserServiceImpl implements UserService {

    public void hello(String name) {
        System.out.println("这是服务提供者provider02,hello:"+name);
    }
}
