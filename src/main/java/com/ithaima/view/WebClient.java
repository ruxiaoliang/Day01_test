package com.ithaima.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.ithaima.service.AccountService;
import com.ithaima.service.UserService;
import com.ithaima.service.impl.UserServiceImpl;


public class WebClient {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //第一种创建的方式
        AccountService accountService01 = ac.getBean("accountService01", AccountService.class);
        accountService01.show();
        //第三种创建的方式>>可以看到JVM是优先创建静态方法进堆区的
        AccountService accountService03 = ac.getBean("accountService03", AccountService.class);
        accountService03.show();
        //第二种创建的方式
        AccountService accountService02 = ac.getBean("accountService02", AccountService.class);
        accountService02.show();

        //懒汉模式
        ClassPathResource cpr = new ClassPathResource("applicationContext.xml");
        AccountService acc = new XmlBeanFactory(cpr).getBean("accountService01", AccountService.class);
        acc.show();
    }

    @Test
    public void test02(){
        ApplicationContext cpxac = new ClassPathXmlApplicationContext("applicationContext.xml");
        for (int i = 0; i < 10; i++) {
            AccountService accountService01 = cpxac.getBean("accountService01", AccountService.class);
            System.out.println(accountService01);
        }

        for (int i = 0; i < 10; i++) {
            AccountService accountService04 = cpxac.getBean("accountService04", AccountService.class);
            System.out.println(accountService04);
        }
    }


    @Test
    public void test03(){
        ClassPathXmlApplicationContext cpxac01 = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService05 = cpxac01.getBean("accountService05", AccountService.class);
        accountService05.show();
        cpxac01.close();

        //为了避免影响，在执行本行代码的时候请注释applicationContact之前的内容
        ClassPathXmlApplicationContext cpxac02 = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService06 = cpxac02.getBean("accountService06", AccountService.class);
        accountService06.show();
        cpxac02.close();
    }

    @Test
    public void test04(){
        ApplicationContext cpxac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) cpxac.getBean("userService", UserService.class);
        System.out.println(userService.toString());
    }

}
