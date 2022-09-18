package com.progetto.rest.controllers;

import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import com.progetto.repository.ClienteRepository;
import com.progetto.repository.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/api/v1/store")
//@CrossOrigin(originPatterns = "*")
public class EcommerceRestController
{   @Autowired
    private OrdineRepository ordineRepository;
    private ClienteRepository clienteRepository;

    @GetMapping("/ordini")
    @Transactional(readOnly=true)
    Iterable<Ordine> getOrdini()
    {   System.out.println(ordineRepository.findAll());
        return ordineRepository.findAll();
    }

    @GetMapping(path="/clienti")
    @Transactional(readOnly = true)
    Iterable<Cliente> getClienti()
    {   //System.out.println(ordineRepository.findAll());
        Iterable<Cliente> temp;
        return clienteRepository.findAll();
    }

}
