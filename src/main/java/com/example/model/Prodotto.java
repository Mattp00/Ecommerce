package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="prodotto")
public class Prodotto
{   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long cod_prodotto;
    private Double prezzo;
    private String descrizione;

    public Prodotto()
    {
    }

    public Prodotto(Long id, Long cod_prodotto, Double prezzo, String descrizione) {
        this.id = id;
        this.cod_prodotto = cod_prodotto;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCod_prodotto() {
        return cod_prodotto;
    }

    public void setCod_prodotto(Long cod_prodotto) {
        this.cod_prodotto = cod_prodotto;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(id, prodotto.id) && Objects.equals(cod_prodotto, prodotto.cod_prodotto) && Objects.equals(prezzo, prodotto.prezzo) && Objects.equals(descrizione, prodotto.descrizione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cod_prodotto, prezzo, descrizione);
    }
}
