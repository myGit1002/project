package com.local.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/upload")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
