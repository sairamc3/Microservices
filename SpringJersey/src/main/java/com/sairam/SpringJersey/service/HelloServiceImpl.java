package com.sairam.SpringJersey.service;

public class HelloServiceImpl implements HelloService {
    @Override
    public void retryService(String sql) {
        System.out.println("retry Service called");

        throw new RuntimeException();
    }
}
