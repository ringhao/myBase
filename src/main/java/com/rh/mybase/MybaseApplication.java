package com.rh.mybase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.rh.mybase.mapper")
@SpringBootApplication
public class MybaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaseApplication.class, args);
    }

}
