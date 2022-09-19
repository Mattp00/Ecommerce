package com.progetto.repository;

import com.progetto.model.Ordine;
import com.progetto.model.Prodotto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdottoRepository extends CrudRepository<Prodotto,Long>
{   Iterable<Prodotto> findAll();
    Iterable<Prodotto> findAllById(Iterable<Long> id);
    Optional<Prodotto> findById(Long id);
    void delete(Prodotto ordine);
    void deleteById(Long id);
}
