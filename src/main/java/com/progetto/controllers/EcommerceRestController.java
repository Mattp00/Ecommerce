package com.progetto.rest.controllers;

import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import com.progetto.repository.ClienteRepository;
import com.progetto.repository.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(path="/store")
public class EcommerceRestController
{   @Autowired
    private OrdineRepository ordineRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/ordini")

    Iterable<Ordine> getOrdini()
    {   System.out.println(ordineRepository.findAll());
        return ordineRepository.findAll();
    }

    @GetMapping(path="/clienti")
    //@Transactional(readOnly = true)
    Iterable<Cliente> getClienti()
    {   Iterable<Cliente> temp;
        return clienteRepository.findAll();
    }

    @GetMapping(path="/prova")
    String provaLista()
    {   return "ciao";
    }

}
