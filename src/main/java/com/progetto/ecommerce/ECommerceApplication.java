package com.progetto.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@GetMapping
	public String index()
	{	return "<ul>" +
				"<li>Questo è l'indice</li>" +
				"</ul>";
	}

	@GetMapping("/ritornaCiao")
	public List<String> ciao()
	{	return List.of("Ciao","a tutti");
	}

}
