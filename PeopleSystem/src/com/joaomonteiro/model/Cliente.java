package com.joaomonteiro.model;

public class Cliente extends Pessoa{

    private String codigo;
    private String profissao;

//    public Cliente(String nome, String datanasc) {
//        super(nome,datanasc);
//    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
