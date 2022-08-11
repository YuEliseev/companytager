package com.yuEliseev.companytager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CompanyTagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyTagerApplication.class, args);
	}

}
