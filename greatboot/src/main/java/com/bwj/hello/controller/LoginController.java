package com.bwj.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("login")
    public String login(@RequestParam("username") String username,
                              @RequestParam("password") String password
                              ){
        // System.out.println(username+"\t"+password);
        if(username.equals("tom")&&password.equals("123")){
            return "success";
        }else{
            return "fail";
        }
    }
}
