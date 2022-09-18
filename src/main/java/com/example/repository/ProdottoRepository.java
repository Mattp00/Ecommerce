package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Prodotto;

@Repository
public interface ProdottoRepository extends CrudRepository<Prodotto,Long>
{   Iterable<Prodotto> findAll();
}
