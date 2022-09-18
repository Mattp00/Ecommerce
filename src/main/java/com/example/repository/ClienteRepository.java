package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.model.Cliente;

@Repository
@Service
public interface ClienteRepository extends CrudRepository<Cliente,Long>
{   Iterable<Cliente> findAll();
}
