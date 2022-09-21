package com.progetto.repository;

import com.progetto.model.Magazzino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazzinoRepository extends CrudRepository<Magazzino,Long>
{   Iterable<Magazzino> findAll();
}
