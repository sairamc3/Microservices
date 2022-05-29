package com.sairam.SpringJersey;

import com.sairam.SpringJersey.service.HelloService;
import com.sairam.SpringJersey.service.HelloServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class SpringJerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJerseyApplication.class, args);
	}


	@Bean
	public HelloService helloService(){
		return new HelloServiceImpl();
	}
}
