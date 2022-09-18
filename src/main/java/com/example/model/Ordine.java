package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="ordine")
@IdClass(Ordine.class)
public class Ordine implements Serializable
{   @Id
    private Long id_ordine;
    @Id
    private Long cod_prodotto;
    private Integer quantita;
    private Long acquirente;

    public Ordine()
    {
    }

    public Ordine(Long id_ordine, Long cod_prodotto, Integer quantita, Long acquirente)
    {   this.id_ordine = id_ordine;
        this.cod_prodotto = cod_prodotto;
        this.quantita = quantita;
        this.acquirente = acquirente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Ordine ordine = (Ordine) o;
        return Objects.equals(id_ordine, ordine.id_ordine) && Objects.equals(cod_prodotto, ordine.cod_prodotto) && Objects.equals(quantita, ordine.quantita) && Objects.equals(acquirente, ordine.acquirente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ordine, cod_prodotto, quantita, acquirente);
    }

    public Long getId_ordine() {
        return id_ordine;
    }

    public Long getCod_prodotto() {
        return cod_prodotto;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public Long getAcquirente() {
        return acquirente;
    }

    public void setId_ordine(Long id_ordine) {
        this.id_ordine = id_ordine;
    }

    public void setCod_prodotto(Long cod_prodotto) {
        this.cod_prodotto = cod_prodotto;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public void setAcquirente(Long acquirente) {
        this.acquirente = acquirente;
    }
}
