package com.br.dev.api.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static List<Cliente> clientes = new ArrayList<>();
    

    public static List<Cliente> todos(){
        return Cliente.clientes;
    }

    public static void adicionar(Cliente cliente){
        Cliente.clientes.add(cliente);
    }

    public static void set(List<Cliente> cliente){
        Cliente.clientes = cliente;
    }

    private int id;
    private int numero;
    private String nome;
    private String email;
    private String senha;
    private String cep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
} 
