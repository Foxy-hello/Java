package com.bwie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bwie.dao")
public class BootSsmJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSsmJspApplication.class, args);
    }

}
