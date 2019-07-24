package com.imooc.sellconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SellConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellConfigApplication.class, args);
    }

}
