package dev.elma.telecom_management_app_spring;

import dev.elma.telecom_management_app_spring.entities.Client;
import dev.elma.telecom_management_app_spring.entities.Subscribe;
import dev.elma.telecom_management_app_spring.entities.SubscribeType;
import dev.elma.telecom_management_app_spring.repositories.ClientRepository;
import dev.elma.telecom_management_app_spring.repositories.SubscribeRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication @AllArgsConstructor
public class TelecomManagementAppSpringApplication implements CommandLineRunner {
    ClientRepository clientRepository;
    SubscribeRepository subscribeRepository;
    public static void main(String[] args) {
        SpringApplication.run(TelecomManagementAppSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Abdeljalil","Ahmed","Ayoub","Soufyen").forEach(n->{
            Client client = Client.builder().name(n).email(n + "@gmail.com").username(n + "user").build();
            clientRepository.save(client);
        });

        Client abdeljalil = clientRepository.findByName("Abdeljalil").get();


        Stream.of(SubscribeType.values()).forEach(v->{
            Subscribe subscribe = Subscribe.builder().subscribeDate(new Date()).subscribeType(v).pay(new Random().nextDouble(1000)).amount(new Random().nextDouble(5000)).client(abdeljalil).build();
            subscribeRepository.save(subscribe);
        });


    }
}
