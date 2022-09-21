package com.progetto.repository;

import com.progetto.model.Prodotto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends CrudRepository<Prodotto,Long>
{   Iterable<Prodotto> findAll();
}
