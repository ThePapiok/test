package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "hello";
    }
}
