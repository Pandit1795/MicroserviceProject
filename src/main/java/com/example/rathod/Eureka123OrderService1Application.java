package com.example.rathod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
@EnableEurekaClient
@FeignClient
@SpringBootApplication
public class Eureka123OrderService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka123OrderService1Application.class, args);
	}

}
