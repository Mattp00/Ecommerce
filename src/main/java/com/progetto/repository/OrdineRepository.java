package com.progetto.repository;

import com.progetto.model.Ordine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface OrdineRepository extends CrudRepository<Ordine,Long>
{   Iterable<Ordine> findAll();
}
