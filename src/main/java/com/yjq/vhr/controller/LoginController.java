package com.yjq.vhr.controller;

import com.yjq.vhr.common.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {
    @GetMapping("/login")
    public Result login() {
        return Result.error("请登录！");
    }
}
