package com.joaomonteiro.apps;

import com.joaomonteiro.contas.Conta;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.setNome("fds");
        c1.setLimite(1000);
        c1.setNumero(21);

        c1.depositar(1000);
    }
}
