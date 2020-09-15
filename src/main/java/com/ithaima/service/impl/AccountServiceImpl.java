package com.ithaima.service.impl;

import com.ithaima.service.AccountService;
import java.time.LocalDateTime;

public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl() {
        System.out.println("类在此时被初始化" + LocalDateTime.now());
    }

    @Override
    public void show() {
        System.out.println("hello world");
    }

    public void initMethod(){
        System.out.println("AccountServiceImpl创建了");
    }

    public void destroyMethod(){
        System.out.println("AccountServiceImpl销毁了");
    }
}
