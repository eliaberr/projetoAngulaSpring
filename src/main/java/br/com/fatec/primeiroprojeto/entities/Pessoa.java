package br.com.fatec.primeiroprojeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TBL_CLIENT")

public class Pessoa {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private static String name;
    private static String email;
    private static int telefone;
    private static String endereco;
    private static String estado;
    private static int cep;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public static String getName() {
        return name;
    }
    
    public void setName(String name) {
        Pessoa.name = name;
    }
    
     public static String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        Pessoa.email = email;
    }

     public static int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
        Pessoa.telefone = telefone;
    }
    
    public static String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        Pessoa.endereco = endereco;
    }
   
    public static String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        Pessoa.estado = estado;
    }

    
    public static int getCep() {
        return cep;
    }
    
    public void setCep(int cep) {
        Pessoa.cep = cep;
    }

    
    
}
