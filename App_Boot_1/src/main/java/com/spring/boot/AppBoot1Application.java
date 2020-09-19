package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.spring.boot")
public class AppBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppBoot1Application.class, args);
		System.out.println("call");
	}

}
