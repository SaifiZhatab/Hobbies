package com.zs.hobbies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String st[]) {
        SpringApplication.run(Application.class,st);
    }
}


//    swagger url
//    http://localhost:8081/swagger-ui.html#/