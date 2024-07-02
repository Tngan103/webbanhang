
package com.hutech.webbanhang.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String home() {
        return "/home/index";
    }

    @GetMapping("/home")
    public String index() {
        return "/home/index";
    }
}