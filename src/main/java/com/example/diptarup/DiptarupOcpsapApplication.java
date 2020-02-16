package com.example.diptarup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiptarupOcpsapApplication {

	@GetMapping("/")
	public String myPage() {
		return "OCP and SAP Integration Starter Page";
	}

	@GetMapping("/{input}")
	public String sapCall(@PathVariable String input) {
		return "Your Call to SAP with parameters";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiptarupOcpsapApplication.class, args);
	}

}
