package com.accessory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan
public class AccessoryTradeSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccessoryTradeSystemApplication.class, args);
	}
}
