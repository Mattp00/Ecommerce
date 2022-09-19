package com.progetto.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="amministratore")
public class Amministratore
{   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private int eta;

    public Amministratore()
    {
    }

    public Amministratore(Long id, String nome, String cognome, String email, int eta)
    {   this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.eta = eta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Amministratore that = (Amministratore) o;
        return eta == that.eta && Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cognome, that.cognome) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, email, eta);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
