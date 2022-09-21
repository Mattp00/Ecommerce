package com.progetto.repository;

import com.progetto.model.Amministratore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmministratoreRepository extends CrudRepository<Amministratore,Long>
{   Iterable<Amministratore> findAll();
}
