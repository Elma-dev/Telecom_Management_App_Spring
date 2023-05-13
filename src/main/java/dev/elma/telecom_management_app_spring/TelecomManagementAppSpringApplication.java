package dev.elma.telecom_management_app_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelecomManagementAppSpringApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(TelecomManagementAppSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
