package com.progetto.controllers;

import com.progetto.exceptions.EmailAlreadyUsedException;
import com.progetto.exceptions.UserAlreadyExistsException;
import com.progetto.model.Amministratore;
import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import com.progetto.repository.ClienteRepository;
import com.progetto.repository.OrdineRepository;
import com.progetto.services.AmministratoreService;
import com.progetto.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/Amministrazione")
public class EcommerceRestControllerAmministratore
{   @Autowired
    OrdineRepository ordineRepository;
    @Autowired
    ClienteService clienteService;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    AmministratoreService amministratoreService;

    @GetMapping(path="/ordini")
    @ResponseBody
    public Iterable<Ordine> getOrdini()     //Ritorna gli ordini di tutti i clienti
    {   return ordineRepository.findAll();
    }

    @GetMapping(path="/clienti")
    @ResponseBody
    public Iterable<Cliente> getClienti()
    {   return clienteRepository.findAll();
    }

    @GetMapping(path="/clienti/get/{id}")
    @ResponseBody
    public ResponseEntity getCliente(@PathVariable("id") Long id)
    {   Optional<Cliente> cliente = clienteService.getClienteById(id);
        if (!cliente.isPresent())
            return new ResponseEntity("Cliente non presente", HttpStatus.NOT_FOUND);
        return new ResponseEntity(cliente, HttpStatus.FOUND);
    }

    @DeleteMapping(path="/clienti/remove/{id}")
    @ResponseBody
    public ResponseEntity removeCliente(@PathVariable("id") Long id)
    {   Optional<Cliente> cliente = clienteService.getClienteById(id);
        if (!cliente.isPresent())
            return new ResponseEntity("Cliente non presente", HttpStatus.NOT_FOUND);
        clienteService.removeClienteById(id);
        return new ResponseEntity(cliente + "eliminato",HttpStatus.FOUND);
    }

    @PostMapping(path="/registrazione")
    @ResponseBody
    public ResponseEntity createAmministratore(Amministratore amministratore)
    {   try
        {   amministratoreService.registra(amministratore);
            return new ResponseEntity("amministratore registrato ",HttpStatus.CREATED);
        }
        catch (EmailAlreadyUsedException e)
        {   return new ResponseEntity("email già esistente",HttpStatus.BAD_REQUEST);
        }
        catch (UserAlreadyExistsException e)
        {    return new ResponseEntity("utente già esistente",HttpStatus.BAD_REQUEST);
        }
    }

}

