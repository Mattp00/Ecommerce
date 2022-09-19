package com.progetto.repository;

import com.progetto.model.Magazzino;
import com.progetto.model.Ordine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MagazzinoRepository extends CrudRepository<Magazzino,Long>
{   Iterable<Magazzino> findAll();
    Iterable<Magazzino> findAllById(Iterable<Long> id);
    Optional<Magazzino> findById(Long id);
    void delete(Magazzino ordine);
    void deleteById(Long id);
}
