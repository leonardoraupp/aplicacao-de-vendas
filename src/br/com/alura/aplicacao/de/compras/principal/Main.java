package br.com.alura.aplicacao.de.compras.principal;

import br.com.alura.aplicacao.de.compras.modelos.Carrinho;
import br.com.alura.aplicacao.de.compras.modelos.CartaoDeCredito;
import br.com.alura.aplicacao.de.compras.modelos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respostaCadastrarProduto = "s";
        String nome = "";
        double valor = 0;
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        Carrinho carrinho = new Carrinho();

        System.out.println("APLICAÇÃO DE VENDAS");
        cartaoDeCredito.configurarLimite();

        while (respostaCadastrarProduto.equalsIgnoreCase("s")) {
                    System.out.println("Digite o nome do produto");
                    nome = teclado.next();
                    System.out.println("Digite o valor do produto");
                    valor = teclado.nextDouble();
                    Produto produto = new Produto (nome, valor);
                    carrinho.adicionarItens(produto);
                    carrinho.verItemsDoCarrinho();

                    System.out.println("Cadastrar novo produto? (s/n): ");
                    respostaCadastrarProduto = teclado.next();
            }
        carrinho.somarProdutos();
        cartaoDeCredito.aprovarCompra(carrinho);

        System.out.println("*****");
        System.out.println("Relatório:");
        System.out.println("Limite atual " + cartaoDeCredito.getLimite());
        System.out.println(("Valor total do carrinho " + carrinho.getTotal()));
        carrinho.verItemsDoCarrinho();
        System.out.println("*****");
        System.out.println("Encerrando...");
    }
}