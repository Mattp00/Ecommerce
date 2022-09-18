package com.progetto.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="cliente")
public class Cliente
{   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private int eta;

    public Cliente()
    {
    }

    public Cliente(Long id,String nome,String cognome,String email,int eta)
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
        Cliente cliente = (Cliente) o;
        return eta == cliente.eta && Objects.equals(id, cliente.id) && Objects.equals(nome, cliente.nome) && Objects.equals(cognome, cliente.cognome) && Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, email, eta);
    }
}

