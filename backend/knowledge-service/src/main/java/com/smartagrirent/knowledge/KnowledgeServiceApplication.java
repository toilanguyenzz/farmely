package com.smartagrirent.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KnowledgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnowledgeServiceApplication.class, args);
    }
}
