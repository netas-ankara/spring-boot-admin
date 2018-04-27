package com.netas.ankara.springbootadminserverbasicauth;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerBasicAuthApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerBasicAuthApplication.class, args);
    }


}
