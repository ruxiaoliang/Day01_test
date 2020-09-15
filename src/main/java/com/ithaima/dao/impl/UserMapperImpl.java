package com.ithaima.dao.impl;

import com.ithaima.dao.UserMapper;

public class UserMapperImpl implements UserMapper {
    @Override
    public void show() {
        System.out.println("方法执行了");
    }
}
