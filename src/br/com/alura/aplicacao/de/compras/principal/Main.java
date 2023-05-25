package br.com.alura.aplicacao.de.compras.principal;

import br.com.alura.aplicacao.de.compras.modelos.Carrinho;
import br.com.alura.aplicacao.de.compras.modelos.CartaoDeCredito;
import br.com.alura.aplicacao.de.compras.modelos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcaoUser = 1;


        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        Carrinho carrinho = new Carrinho();

        System.out.println("APLICAÇÃO DE VENDAS");
        cartaoDeCredito.configurarLimite();

        while (opcaoUser != 0) {
            System.out.println("CADASTRO DE PRODUTOS");

            while (opcaoUser != 0) {
                String nome;
                double valor;


                System.out.println("Digite o nome do produto");
                nome = teclado.next();
                System.out.println("Digite o valor do produto");
                valor = teclado.nextDouble();
                Produto produto = new Produto(nome, valor);
//
//                produto.setNome(nome);
//                produto.setValor(valor);
                carrinho.adicionarItens(produto);

                System.out.println("Opção 0 para Sair");
                System.out.println("Opção 1 para Continuar");
                opcaoUser = teclado.nextInt();
            }
            System.out.println("Passei aqui");
            carrinho.somarProdutos();
            cartaoDeCredito.aprovarCompra(carrinho);
            System.out.println("Saldo atual: " + cartaoDeCredito.getSaldo());
            System.out.println("Limite atual " + cartaoDeCredito.getLimite());
            System.out.println(("Valor total do carrinho " + carrinho.getTotal()));
            System.out.println("Items do carrinho");
            carrinho.verItemsDoCarrinho();

            System.out.println("Encerrar programa - 0");
            System.out.println("Continuar comprando - 1");
            opcaoUser = teclado.nextInt();
        }
        System.out.println("Encerrando...");
    }

}