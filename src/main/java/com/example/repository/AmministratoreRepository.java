package com.progetto.repository;

import com.progetto.model.Amministratore;
import com.progetto.model.Ordine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AmministratoreRepository extends CrudRepository<Amministratore,Long>
{   Iterable<Amministratore> findAll();
    Iterable<Amministratore> findAllById(Iterable<Long> id);
    Optional<Amministratore> findById(Long id);
    void delete(Amministratore ordine);
    void deleteById(Long id);
    boolean existsById(Long Long);
    boolean existsByEmail(String email);
}
