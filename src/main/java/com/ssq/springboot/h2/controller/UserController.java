package com.ssq.springboot.h2.controller;  
  
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ssq.springboot.h2.entity.User;
import com.ssq.springboot.h2.repository.UserRepository;  
  
  
@RestController  
public class UserController {  
  
  @Autowired  
  private UserRepository userRepository;  
  
  @GetMapping("/user/{id}")// 注意，此处使用的是GetMapping注解，该注解的作用类似与@RequestMapping(value="/user/{id}" ,method=RequestMethod.GET)，@PostMapping注解同理  
  public Optional<User> findById(@PathVariable Long id) {  
    return this.userRepository.findById(id);  
  }  
}  