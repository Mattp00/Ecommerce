package com.progetto.repository;

import com.progetto.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long>
{   Iterable<Cliente> findAll();
}
