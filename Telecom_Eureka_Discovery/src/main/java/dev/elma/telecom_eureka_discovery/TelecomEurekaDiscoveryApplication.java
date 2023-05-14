package dev.elma.telecom_eureka_discovery;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TelecomEurekaDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelecomEurekaDiscoveryApplication.class, args);
    }

}
