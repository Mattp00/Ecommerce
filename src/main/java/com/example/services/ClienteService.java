package com.progetto.services;

import com.progetto.exceptions.EmailAlreadyUsedException;
import com.progetto.exceptions.UserAlreadyExistsException;
import com.progetto.model.Cliente;
import com.progetto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService
{   @Autowired
    private ClienteRepository clienteRepository;

    public Cliente registra(Cliente cliente) throws EmailAlreadyUsedException,UserAlreadyExistsException
    {   if (clienteRepository.existsByEmail(cliente.getEmail()))
            throw new EmailAlreadyUsedException();
        if (clienteRepository.existsById(cliente.getId()))
            throw new UserAlreadyExistsException();
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getClienteById(Long id)
    {   return clienteRepository.findById(id);
    }

    public void removeClienteById(Long id)
    {   clienteRepository.deleteById(id);
    }
}
