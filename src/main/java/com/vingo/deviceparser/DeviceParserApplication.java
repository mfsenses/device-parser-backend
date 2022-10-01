package com.vingo.deviceparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
@ComponentScan("com.vingo.deviceparser")
public class DeviceParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceParserApplication.class, args);
	}

}
