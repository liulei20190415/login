package com.bwj.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {
    @RequestMapping("/regexptest")
    public String regex(HttpServletRequest request, HttpSession session){
        request.setAttribute("book","疯狂SpringBoot讲义");
        session.setAttribute("school","疯狂软件");
        request.getServletContext().setAttribute("name","Thymeleaf模板引擎");
        return "100success";
    }
}
