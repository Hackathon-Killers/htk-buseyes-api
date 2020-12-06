package com.hackathonkiller.buseyesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BuseyesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuseyesApiApplication.class, args);
    }

}
