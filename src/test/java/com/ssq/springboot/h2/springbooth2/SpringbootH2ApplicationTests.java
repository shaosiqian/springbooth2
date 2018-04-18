package com.ssq.springboot.h2.springbooth2;

import java.util.Optional;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ssq.springboot.h2.entity.User;
import com.ssq.springboot.h2.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootH2ApplicationTests {

    @Autowired  
    private UserRepository repository;  
      
    @Test  
    public void test(){  
        Optional<User> u = repository.findById(1L);  
        Assert.assertEquals("成功的测试用例", "张三", u);  
    }  

}
