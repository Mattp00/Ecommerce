package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Amministratore;

@Repository
public interface AmministratoreRepository extends CrudRepository<Amministratore,Long>
{   Iterable<Amministratore> findAll();
}
