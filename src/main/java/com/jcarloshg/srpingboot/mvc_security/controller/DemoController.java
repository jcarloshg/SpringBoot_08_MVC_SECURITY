package com.jcarloshg.srpingboot.mvc_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String getHome() {
        return "Home";
    }

}
