package com.sofwin.service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {

    public void hello(String name) {
        System.out.println("这是服务提供者provider01,hello:"+name);
    }
}
