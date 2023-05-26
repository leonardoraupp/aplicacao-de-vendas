package br.com.alura.aplicacao.de.compras.principal;

import br.com.alura.aplicacao.de.compras.modelos.Carrinho;
import br.com.alura.aplicacao.de.compras.modelos.CartaoDeCredito;
import br.com.alura.aplicacao.de.compras.modelos.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        System.out.println("Insira o limite do seu cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        System.out.println("*****");
        System.out.println("APLICAÇÃO DE VENDAS");

        String sair = "s";
        while (sair.equalsIgnoreCase("s")) {
                    System.out.println("Digite o nome do produto.");
                    String descricao = leitura.next();

                    System.out.println("Digite o valor do produto.");
                    double valor = leitura.nextDouble();

                    Produto produto = new Produto (descricao, valor);
                    carrinho.adicionarItemAoCarrinho(produto);

                    System.out.println("Cadastrar novo produto? (s/n): ");
                    sair = leitura.next();
                    carrinho.somarProdutos();

        }
        cartao.aprovarCompra(carrinho);
        System.out.println("*****");
        Collections.sort(carrinho.getCarrinho());
//        carrinho.getCarrinho().sort(Comparator.comparing(Produto::getValor)); //fazendo a mesma coisa que a linha de cima.

        if (cartao.isCompraAprovada()) {
            System.out.println("PRODUTOS COMPRADOS");
            for (Produto item: carrinho.getCarrinho()) {
                System.out.println(item.getDescricao() + " - " + item.getValor());
            }
        }
        System.out.println("Encerrando...");
    }
}