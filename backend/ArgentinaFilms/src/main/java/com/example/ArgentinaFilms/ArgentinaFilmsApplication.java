package com.example.ArgentinaFilms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.example.ArgentinaFilms")
@SpringBootApplication
public class ArgentinaFilmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArgentinaFilmsApplication.class, args);
		System.out.println("hola");
	}

}
