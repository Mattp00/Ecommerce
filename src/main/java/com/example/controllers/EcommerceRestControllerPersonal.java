package com.progetto.controllers;

import com.progetto.exceptions.EmailAlreadyUsedException;
import com.progetto.exceptions.UserAlreadyExistsException;
import com.progetto.exceptions.UserNotFoundException;
import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import com.progetto.repository.ClienteRepository;
import com.progetto.repository.OrdineRepository;
import com.progetto.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(path="/Account")
public class EcommerceRestControllerPersonal
{   @Autowired
    private OrdineRepository ordineRepository;
    @Autowired
    private ClienteService clienteService;

    @GetMapping(path="/ordini")
    @ResponseBody
    Iterable<Ordine> getOrdini(Cliente acquirente)
    {  if (!ordineRepository.existsById(acquirente.getId()))
            throw new UserNotFoundException();
        return ordineRepository.findByAcquirente(acquirente);
    }

    @PostMapping(path="/Registrazione")
    ResponseEntity createCliente(@Valid @RequestBody Cliente cliente)
    {   try
        {   clienteService.registra(cliente);
            return new ResponseEntity("User registered",HttpStatus.CREATED);
        }
        catch (EmailAlreadyUsedException e)
        {   return new ResponseEntity("user already exists", HttpStatus.BAD_REQUEST);
        }
        catch (UserAlreadyExistsException e)
        {   return new ResponseEntity("user already exists", HttpStatus.BAD_REQUEST);
        }
    }


}
