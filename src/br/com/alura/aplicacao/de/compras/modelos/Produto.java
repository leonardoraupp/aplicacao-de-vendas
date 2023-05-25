package br.com.alura.aplicacao.de.compras.modelos;

import java.util.Scanner;

public class Produto {

    private static String nome;
    private static double valor;
    private static Scanner leitorDeDados = new Scanner(System.in);

    private Carrinho carrinho = new Carrinho();

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double setValor(double valor) {
        return this.valor = valor;
    }

    public void cadastrarProduto() {
        int opcaoUser = 1;

        System.out.println("CADASTRO DE PRODUTOS");

        while (opcaoUser != 0) {
            System.out.println("Digite o nome do produto");
            nome = leitorDeDados.next();
            System.out.println("Digite o valor do produto");
            valor = leitorDeDados.nextDouble();
            setNome(nome);
            setValor(valor);

            System.out.println("Opção 0 para Sair");
            System.out.println("Opção 1 para Continuar");
            opcaoUser = leitorDeDados.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Produto {" +
                " nome:" + getNome() +
                " valor:" + getValor() +
                " }";
    }
}
