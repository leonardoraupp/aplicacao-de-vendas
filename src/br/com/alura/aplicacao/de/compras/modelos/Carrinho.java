package br.com.alura.aplicacao.de.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> carrinho;
    private double valorTotal = 0;

    public Carrinho() {
        this.carrinho = new ArrayList<>();
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Produto> adicionarItemAoCarrinho(Produto item) {
        List <Produto> produtos = new ArrayList<>();
        carrinho.add(item);
        return carrinho;
    }

    public double somarProdutos() {
        for (Produto produto : getCarrinho()) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }

    public void verItemsDoCarrinho() {
        System.out.println("Itens do carrinho:");
        for (Produto item : carrinho) {
            System.out.println("Descrição " + item.getDescricao());
        }
    }
}