package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lance on 2017/12/27.
 */
@RestController
@RequestMapping("/")
public class MyController {

    @RequestMapping("/")
    public String index(){
        return "Hello world";
    }


}
