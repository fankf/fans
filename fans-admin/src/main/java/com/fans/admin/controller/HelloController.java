package com.fans.admin.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    @ApiOperation(value = "hello",notes = "hello",httpMethod = "GET")
    public String hello(){
        return "hello world!";
    }
}
