package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
		//Getting Jenkins parameters in Application
		System.out.println("ARGUMENT LIST:");
		for (String string : args) {
			System.out.println(string);
			
		}
		System.exit(0);
	}

}
