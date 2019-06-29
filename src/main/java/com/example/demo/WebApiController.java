package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class WebApiController {

    @RequestMapping("hello")
    private String hello() {
        return "SpringBoot!";
    }

    @RequestMapping("/test/{param}")
    private String testPathVariable( @PathVariable String param ) {
        return "受け取ったパラメータ：" + param;
    }

    // /test?param=*
    @RequestMapping("/test")
    private String testRequestParam( @RequestParam() String param ) {
        return "受け取ったパラメータ：" + param;
    }

}
