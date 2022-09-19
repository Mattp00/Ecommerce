package com.progetto.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="magazzino")
public class Magazzino
{   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cod_prodotto;
    private String nome;
    private Integer quantita;

    public Magazzino()
    {
    }

    public Magazzino(Long cod_prodotto, String nome, Integer quantita) {
        this.cod_prodotto = cod_prodotto;
        this.nome = nome;
        this.quantita = quantita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Magazzino magazzino = (Magazzino) o;
        return Objects.equals(cod_prodotto, magazzino.cod_prodotto) && Objects.equals(nome, magazzino.nome) && Objects.equals(quantita, magazzino.quantita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod_prodotto, nome, quantita);
    }

    public Long getCod_prodotto() {
        return cod_prodotto;
    }

    public void setCod_prodotto(Long cod_prodotto) {
        this.cod_prodotto = cod_prodotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }
}
