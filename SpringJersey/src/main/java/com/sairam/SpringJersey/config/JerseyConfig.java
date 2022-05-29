package com.sairam.SpringJersey.config;

import com.sairam.SpringJersey.controller.HelloController;
import com.sairam.SpringJersey.service.HelloService;
import com.sairam.SpringJersey.service.HelloServiceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(HelloController.class);
        register(HelloServiceImpl.class);
    }
}
