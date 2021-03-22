package com.fans.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages={"com.fans.admin"})
public class FansAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FansAdminApplication.class, args);
    }

}
