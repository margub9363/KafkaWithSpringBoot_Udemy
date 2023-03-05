package com.learnkafka.libraryeventsproducre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.learnkafka")
public class LibraryEventsProducreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryEventsProducreApplication.class, args);
	}

}
