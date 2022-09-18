package com.example.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Cliente;
import com.example.model.Ordine;
import com.example.repository.ClienteRepository;
import com.example.repository.OrdineRepository;



@Controller
@RequestMapping(path="/api/store")
public class EcommerceRestController
{   @Autowired
    private OrdineRepository ordineRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/ordini")
    Iterable<Ordine> getOrdini()
    {   Iterable<Ordine> temp = ordineRepository.findAll();
        return ordineRepository.findAll();
    }

    @GetMapping("/clienti")
    //@Transactional(readOnly = true)
    Iterable<Cliente> getClienti()
    {   Iterable<Cliente> temp;
        return clienteRepository.findAll();
    }

    @GetMapping("/prova")
    String provaLista()
    {   return "ciao";
    }

}
