package com.joaomonteiro.model;

import com.joaomonteiro.auxiliares.Endereco;

public abstract class Pessoa {

    protected String nome, datanasc, telsContato;
    protected Endereco endereco;  // Alterado para objeto Endereco

//    public Pessoa(String nome, String datanasc){
//        this.nome = nome;
//        this.datanasc = datanasc;
//    }

    public void cadastrar(){}

    public int obterIdade(){
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public Endereco getEndereco() {  // Alterado para retornar Endereco
        return endereco;
    }

    public void setEndereco(Endereco endereco) {  // Alterado para aceitar Endereco
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }
}
