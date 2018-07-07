package com.yodean.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SharpServerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharpServerWebApplication.class, args);
	}
}
