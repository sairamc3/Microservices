package com.sairam.SpringJersey.controller;

import com.sairam.SpringJersey.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){

        this.helloService.retryService("Attempting");

        return "Hello from Jersey";
    }
}
