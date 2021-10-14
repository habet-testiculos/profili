package com.example.profili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProfiliApplication {
	
	
	@Autowired
	private Asker asker;

	public static void main(String[] args) {
		SpringApplication.run(ProfiliApplication.class, args);
	}
	
	@GetMapping("/get")
	public String getValue() {
		return String.format("Deger -> %s", asker.getDeger());
	}
}
