package com.ithaima.service.impl;

import com.ithaima.dao.UserMapper;
import com.ithaima.dao.impl.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.ithaima.service.UserService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserServiceImpl implements UserService {
    private String username;
    private int age;
    @Autowired
    private UserMapper dao;
    private String[] arr;
    private List<String> list;
    private Map<String,String> map;
    private Properties prop;

    public UserServiceImpl() {
        System.out.println("类在此时被初始化" + LocalDateTime.now());
    }

    @Override
    public void show() {
        System.out.println("hello web world");
    }

    public void setDao(UserMapperImpl dao) {

    }

    public void setAge(String age) {

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDao(UserMapper dao) {
        this.dao = dao;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", com.ithaima.dao=" + dao +
                ", arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", map=" + map +
                ", prop=" + prop +
                '}';
    }
}
