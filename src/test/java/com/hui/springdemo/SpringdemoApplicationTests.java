package com.hui.springdemo;

import com.hui.springdemo.dao.PersonDao;
import com.hui.springdemo.model.Auth;
import com.hui.springdemo.model.AuthResposity;
import com.hui.springdemo.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.reflect.generics.tree.VoidDescriptor;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {
    @Autowired
    private AuthResposity authResposity;
    @Autowired
    private PersonDao personDao;


    @Test
    public void contextLoads() {
        Auth auth=new Auth();
        auth.setPhone("17785463499");
        auth.setSinDate(new Date());
        auth.setNickname("japname");
        authResposity.save(auth);

    }
    @Test
    public void personLoads() {
        Person p1 = new Person();
        p1.setAge(18);
        p1.setEmail("h@163.com");
        p1.setLastName("HH");

//        Person p2 = new Person();
//        p2.setAge(12);
//        p2.setEmail("bb@163.com");
////        p2.setLastName("BB");
//        personDao.save(p1);

    }


}
