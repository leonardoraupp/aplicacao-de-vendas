package br.com.alura.aplicacao.de.compras.principal;

import br.com.alura.aplicacao.de.compras.modelos.Carrinho;
import br.com.alura.aplicacao.de.compras.modelos.CartaoDeCredito;
import br.com.alura.aplicacao.de.compras.modelos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double limite = 0;
        Carrinho carrinho = new Carrinho();

        System.out.println("Insira o limite do seu cartão: ");
        limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        System.out.println("APLICAÇÃO DE VENDAS");

        String sair = "s";
        while (sair.equalsIgnoreCase("s")) {
                    System.out.println("Digite o nome do produto");
                    String descricao = leitura.next();

                    System.out.println("Digite o valor do produto");
                    double valor = leitura.nextDouble();

                    Produto produto = new Produto (descricao, valor);
                    carrinho.adicionarAoCarrinho(produto);

                    System.out.println("Cadastrar novo produto? (s/n): ");
                    sair = leitura.next();
            }
        carrinho.somarProdutos();
        cartao.aprovarCompra(carrinho);

        System.out.println("*****");
        System.out.println("Relatório:");
        System.out.println("Limite atual " + cartao.getLimite());
        System.out.println(("Valor total do carrinho " + carrinho.getValorTotal()));
        carrinho.verItemsDoCarrinho();
        System.out.println("*****");
        System.out.println("Encerrando...");
    }
}