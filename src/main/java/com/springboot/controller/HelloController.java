package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang_htao on 2019/5/26.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return  "hello world";
    }
}
