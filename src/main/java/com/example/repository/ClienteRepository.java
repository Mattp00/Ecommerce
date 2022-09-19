package com.progetto.repository;

import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
@Service
public interface ClienteRepository extends CrudRepository<Cliente,Long>
{   Iterable<Cliente> findAll();
    Iterable<Cliente> findAllById(Iterable<Long> id);
    Optional<Cliente> findById(Long id);
    void delete(Cliente cliente);
    void deleteById(Long id);
    boolean existsById(Long id);
    Cliente save(Cliente cliente);

    boolean existsByEmail(String email);
}
