package com.sillage.main;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SillageMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(SillageMainApplication.class, args);
    }

}
