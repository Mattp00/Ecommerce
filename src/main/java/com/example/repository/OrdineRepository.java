package com.progetto.repository;

import com.progetto.model.Cliente;
import com.progetto.model.Ordine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OrdineRepository extends CrudRepository<Ordine,Long>
{   Iterable<Ordine> findAll();
    Iterable<Ordine> findAllById(Iterable<Long> id);
    Optional<Ordine> findById(Long id);
    void delete(Ordine ordine);
    void deleteById(Long id);

    @Query("select o from Ordine o where o.acquirente = ?1")
    Iterable<Ordine> findByAcquirente(Cliente acquirente);
}
