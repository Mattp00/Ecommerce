package com.example.ecommerce;

/* import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import com.progetto.repository.ClienteRepository;
import com.progetto.repository.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired; */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List; */

@SpringBootApplication
public class ECommerceApplication
{	/* @Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OrdineRepository ordineRepository; */

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

/* 	@GetMapping
	public String index()
	{	return "<ul>" +
				"<li>Questo è l'indice</li>" +
				"</ul>";
	}

	@GetMapping("/ritornaCiao")
	public List<String> ciao()
	{	return List.of("Ciao","a tutti");
	}

	@GetMapping(path="/clienti")
	@Transactional(readOnly = true)
	Iterable<Cliente> getClienti()
	{   System.out.println(clienteRepository.findAll());
		Iterable<Cliente> temp;
		return clienteRepository.findAll();
	}

	@GetMapping("/ordini")
	@Transactional(readOnly=true)
	Iterable<Ordine> getOrdini()
	{   System.out.println(ordineRepository.findAll());
		return ordineRepository.findAll();
	}
 */
}
