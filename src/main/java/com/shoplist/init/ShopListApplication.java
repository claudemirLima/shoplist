package com.shoplist.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.shoplist.controller","com.shoplist.service"})
@EnableMongoRepositories("com.shoplist.repository")
public class ShopListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopListApplication.class, args);
	}

}
