package com.example.ci.cd.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/home")
	public String welcome(){
		return "welcome home";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
