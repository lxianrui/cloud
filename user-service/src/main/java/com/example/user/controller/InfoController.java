package com.example.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 信息控制器
 *
 * @author Jeffrey Liu
 * @date 2022/08/11
 */
@RequestMapping("/user")
@RestController
public class InfoController {

    @PostMapping
    public void save() {

    }

    @GetMapping
    public String getUserName(){
        return "uname";
    }
}
