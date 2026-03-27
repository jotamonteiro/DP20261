package com.joaomonteiro.apps;

import com.joaomonteiro.model.Cliente;
import com.joaomonteiro.model.Funcionario;
import com.joaomonteiro.auxiliares.Endereco;  // Import adicionado

public class App {
    public static void main(String[] args) {

        System.out.println("========== SISTEMA DE GESTÃO DE PESSOAS ==========\n");

        // ===== CRIANDO FUNCIONÁRIOS =====
        System.out.println("--- FUNCIONÁRIOS ---");

        // Instanciando objeto Funcionario 1
        Funcionario func1 = new Funcionario();
        func1.setNome("João Silva");
        func1.setDatanasc("15/05/1985");

        // Criando e preenchendo objeto Endereco para func1
        Endereco enderecoFunc1 = new Endereco();
        enderecoFunc1.setComplemento("Apto 45");  // Exemplo de complemento
        func1.setEndereco(enderecoFunc1);

        func1.setTelsContato("11 99999-9999");
        func1.setMatricula(1001);
        func1.setSalario(3500.00);
        func1.setDataADM("01/01/2020");
        func1.setCargo("Desenvolvedor Java");

        exibirFuncionario(func1);

        // Aplicar reajuste de salário
        System.out.println("Aplicando reajuste de 15%...");
        func1.reajustarSalario(15);
        System.out.println("Novo salário: R$ " + String.format("%.2f", func1.getSalario()));

        // Promover funcionário
        System.out.println("Promovendo para gerente...");
        func1.promover("Gerente de Projetos");
        System.out.println("Novo cargo: " + func1.getCargo() + "\n");

        // Instanciando objeto Funcionario 2
        Funcionario func2 = new Funcionario();
        func2.setNome("Maria Santos");
        func2.setDatanasc("20/03/1990");

        // Criando e preenchendo objeto Endereco para func2
        Endereco enderecoFunc2 = new Endereco();
        func2.setEndereco(enderecoFunc2);

        func2.setTelsContato("21 98888-8888");
        func2.setMatricula(1002);
        func2.setSalario(2800.00);
        func2.setDataADM("15/06/2021");
        func2.setCargo("Analista de Sistemas");

        exibirFuncionario(func2);

        // Reajuste e promoção
        func2.reajustarSalario(10);
        System.out.println("Reajuste aplicado. Novo salário: R$ " + String.format("%.2f", func2.getSalario()) + "\n");

        // ===== CRIANDO CLIENTES =====
        System.out.println("--- CLIENTES ---");

        // Instanciando objeto Cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Pedro Oliveira");
        cliente1.setDatanasc("10/12/1992");

        // Criando e preenchendo objeto Endereco para cliente1
        Endereco enderecoCliente1 = new Endereco();
        cliente1.setEndereco(enderecoCliente1);

        cliente1.setTelsContato("31 97777-7777");
        cliente1.setCodigo("CLI-001");
        cliente1.setProfissao("Engenheiro Civil");

        exibirCliente(cliente1);

        // Instanciando objeto Cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana Costa");
        cliente2.setDatanasc("25/07/1988");

        // Criando e preenchendo objeto Endereco para cliente2
        Endereco enderecoCliente2 = new Endereco();
        enderecoCliente2.setLogradouro("Av. D");
        enderecoCliente2.setNumero(321);
        enderecoCliente2.setBairro("Centro");
        enderecoCliente2.setCidade("Curitiba");
        enderecoCliente2.setEstado("PR");
        enderecoCliente2.setCep("45678-901");
        enderecoCliente2.setComplemento("Sala 12");  // Exemplo de complemento
        cliente2.setEndereco(enderecoCliente2);

        cliente2.setTelsContato("41 96666-6666");
        cliente2.setCodigo("CLI-002");
        cliente2.setProfissao("Advogada");

        exibirCliente(cliente2);

        // ===== RESUMO FINAL =====
        System.out.println("\n========== RESUMO FINAL ==========");
        System.out.println("Total de Funcionários: 2");
        System.out.println("Total de Clientes: 2");
        System.out.println("\nMaior salário: R$ " + String.format("%.2f", Math.max(func1.getSalario(), func2.getSalario())));
    }

    // Método auxiliar para exibir dados de Funcionário
    private static void exibirFuncionario(Funcionario f) {
        System.out.println("Nome: " + f.getNome());
        System.out.println("Data de Nascimento: " + f.getDatanasc());
        System.out.println("Endereço: " + f.getEndereco().toString());  // Alterado para usar toString() do Endereco
        System.out.println("Telefone: " + f.getTelsContato());
        System.out.println("Matrícula: " + f.getMatricula());
        System.out.println("Salário: R$ " + String.format("%.2f", f.getSalario()));
        System.out.println("Data de Admissão: " + f.getDataADM());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println();
    }

    // Método auxiliar para exibir dados de Cliente
    private static void exibirCliente(Cliente c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Data de Nascimento: " + c.getDatanasc());
        System.out.println("Endereço: " + c.getEndereco().toString());  // Alterado para usar toString() do Endereco
        System.out.println("Telefone: " + c.getTelsContato());
        System.out.println("Código: " + c.getCodigo());
        System.out.println("Profissão: " + c.getProfissao());
        System.out.println();
    }
}