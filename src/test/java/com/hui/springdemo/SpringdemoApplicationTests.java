package com.hui.springdemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hui.springdemo.dao.PersonDao;
import com.hui.springdemo.model.*;
import com.hui.springdemo.service.AuthorService;
import com.hui.springdemo.service.serveimp.AuthorServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.context.junit4.SpringRunner;
import sun.reflect.generics.tree.VoidDescriptor;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.Format;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {
    @Autowired
    private AuthResposity authResposity;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private WallertReposity wallertReposity;
    @Autowired
    private PersonDao personDao;
    @Autowired
    private  ArticReposity articReposity;


    @Test
    public void saveAuthor() {
//        Auth auth = authResposity.findByone(1L);
        Auth auth = new Auth();
        auth.setPhone("17785463411");
        auth.setSinDate(new Date());
        auth.setNickname("japname1");
//        Wallert wallert = auth.getWallert();
//        wallert.setBalance(new BigDecimal("288.00"));
        auth.setWallert(new Wallert(new BigDecimal(288.02)));


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

    @Test
    public void test2() {
//        Auth auth = authorService(1L);
//        auth.setPhone("17785463400");
//        System.out.println(JSON.toJSONString(auth, true));
    }

    @Test
    public void tesr() {
        Auth auth = authResposity.findByone(1L);
        System.out.println(JSON.toJSONString(auth, true));
    }

    @Test
    public void test3() {
        List<Auth> auths = authResposity.findDistinctByNicknameOrPhone("japname", "17785463499");
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test4() {
        List<Auth> auths = authResposity.findByPone("17785463499");
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test5() {
        List<Auth> auths = authResposity.findbyLikePone("a");
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test6() {
        List<Object> auths = authResposity.findArry("a");
        System.out.println(auths);
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test7() {
        List<Auth> auths = new ArrayList<>();
        auths.add(new Auth("c1", "1778000000", new Date()));
        auths.add(new Auth("c2", "1778000001", new Date()));
        auths.add(new Auth("c3", "1778000002", new Date()));
        auths.add(new Auth("c4", "1778000003", new Date()));
        System.out.println(auths);
//     String a= JSON.toJSONString( auths,true );
        System.out.println(JSON.toJSONString(auths, true));

    }

    @Test
    public void test8() {
        List<Auth> auths = authResposity.findByNickname("a", new Sort(Sort.Direction.DESC, "sinDate"));
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test9() {
        List<Auth> auths = authResposity.findbyLikePone1("a");
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test10() {
        List<Auth> auths = authResposity.findByNickname1("a");
        System.out.println(JSON.toJSONString(auths, true));
    }

    @Test
    public void test11() {
        authResposity.setByNickname2("coco1", "17785463477");
    }

    @Test
    public void test13() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(0, 10, sort);
        Page<Auth> auths = authResposity.findAll(pageable);
        System.out.println(JSON.toJSONString(auths));
    }

    @Test
    public void delete() {
        Wallert wallert = wallertReposity.findById(1L).get();
        System.out.println("wallert=========" + wallert);


    }
    @Test
    public void test15() {
        Article  article = articReposity.findByid(1L);
        System.out.println(JSON.toJSONString(article, true));



    }
}
