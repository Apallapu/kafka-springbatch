package com.ankamma.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:kafka.properties")
public class KafkaSpringbatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringbatchApplication.class, args);
	}

}
