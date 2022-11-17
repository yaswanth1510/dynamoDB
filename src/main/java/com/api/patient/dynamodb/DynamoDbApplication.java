package com.api.patient.dynamodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(scanBasePackages = { "com.api.patient.dynamodb"})
@EnableOpenApi
public class DynamoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamoDbApplication.class, args);
    }

}
