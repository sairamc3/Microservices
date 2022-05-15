package com.sairam.SpringScheduler.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/getHello")
    public String sayHello(){
        return "hello";
    }
}
