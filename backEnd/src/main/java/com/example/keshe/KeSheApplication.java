package com.example.keshe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.keshe.mapper")
public class KeSheApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeSheApplication.class, args);
    }

}
