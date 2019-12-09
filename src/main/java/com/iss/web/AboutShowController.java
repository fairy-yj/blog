package com.iss.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutShowController {

    // 跳转到关于我页面
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
