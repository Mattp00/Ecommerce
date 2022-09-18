package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Ordine;


@Repository
public interface OrdineRepository extends CrudRepository<Ordine,Long>
{   Iterable<Ordine> findAll();
}
