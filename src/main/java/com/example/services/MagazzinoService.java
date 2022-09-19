package com.progetto.services;

import com.progetto.model.Magazzino;
import com.progetto.repository.MagazzinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class MagazzinoService
{   @Autowired
    MagazzinoRepository magazzinoRepository;

    public ResponseEntity inserisciMerce(Magazzino prodotto)
    {   Optional<Magazzino> magazzinoOptional = magazzinoRepository.findById(prodotto.getCod_prodotto());
        Magazzino attuale;
        if (magazzinoOptional.isPresent())
        {   attuale = magazzinoOptional.get();
            attuale.setQuantita(attuale.getQuantita()+prodotto.getQuantita()); //aggiunge la quantita
            magazzinoRepository.save(attuale);
            return new ResponseEntity("La quantità dell'oggetto è stata aggiornata", HttpStatus.ACCEPTED);
        }
        magazzinoRepository.save(prodotto);
        return new ResponseEntity("Oggetto aggiunto al magazzino",HttpStatus.CREATED);
    }

    public Iterable<Magazzino> getOggetti()
    {   return magazzinoRepository.findAll();
    }
}
