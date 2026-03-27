package com.joaomonteiro.model;

public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;
    private String dataADM;
    private String cargo;

//    public Funcionario(String nome, String datanasc, int matricula, double salario, String dataADM) {
//        super(nome,datanasc);
//        this.matricula = matricula;
//        this.salario = salario;
//        this.dataADM = dataADM;
//
//    }


    public void reajustarSalario(double percentual){
        this.salario += this.salario * percentual / 100;
    }

    public void promover(String novoCargo){
        this.cargo = novoCargo;

    }

    public int getMatricula() { return matricula; }

    public double getSalario() { return salario; }

    public String getDataADM() { return dataADM; }

    public String getCargo() { return cargo; }

    public void setMatricula(int matricula) { this.matricula = matricula; }

    public void setSalario(double salario) { this.salario = salario; }

    public void setDataADM(String dataADM) { this.dataADM = dataADM; }

    public void setCargo(String cargo) { this.cargo = cargo; }
}
