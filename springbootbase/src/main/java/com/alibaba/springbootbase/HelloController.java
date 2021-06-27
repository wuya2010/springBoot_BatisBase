package com.alibaba.springbootbase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylinWang
 * @data 2021/2/23 22:31
 */
@RestController
@RequestMapping("/test")  //http://localhost:8080/test/hello
public class HelloController {

    //访问地址： http://localhost:8080/hello

    @RequestMapping("/hello") //这里地址不加 /  或 加 / 都可以
    public String helloSpringBoot(){
     return "hello spring boot";
    }
}
