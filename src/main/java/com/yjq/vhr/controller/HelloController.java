package com.yjq.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/personnel/train/hello")
    public String hello1() {
        return "personnel/train";
    }

    @GetMapping("/personnel/salary/hello")
    public String hello2() {
        return "/personnel/salary/";
    }
}
