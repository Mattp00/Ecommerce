package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Magazzino;

@Repository
public interface MagazzinoRepository extends CrudRepository<Magazzino,Long>
{   Iterable<Magazzino> findAll();
}
