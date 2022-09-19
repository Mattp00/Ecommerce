package com.progetto.services;

import com.progetto.exceptions.EmailAlreadyUsedException;
import com.progetto.exceptions.UserAlreadyExistsException;
import com.progetto.model.Amministratore;
import com.progetto.repository.AmministratoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmministratoreService
{   @Autowired
    AmministratoreRepository amministratoreRepository;

    public Amministratore registra(Amministratore amministratore) throws UserAlreadyExistsException, EmailAlreadyUsedException
    {   if (amministratoreRepository.existsById(amministratore.getId()))
            throw new UserAlreadyExistsException();
        if (amministratoreRepository.existsByEmail(amministratore.getEmail()))
            throw new EmailAlreadyUsedException();
        return amministratoreRepository.save(amministratore);
    }
}
