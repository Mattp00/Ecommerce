package com.progetto.controllers;


import com.progetto.model.Magazzino;
import com.progetto.repository.MagazzinoRepository;
import com.progetto.services.MagazzinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/store")
public class EcommerceRestControllerStore
{   @Autowired
    MagazzinoService magazzinoService;

    @PostMapping(path="/aggiungi")
    public ResponseEntity aggiungiArticolo(Magazzino prodotto)
    {   return magazzinoService.inserisciMerce(prodotto);
    }
}
