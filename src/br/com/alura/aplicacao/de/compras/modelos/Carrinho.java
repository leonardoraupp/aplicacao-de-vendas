package br.com.alura.aplicacao.de.compras.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {
    private List<Produto> carrinho = new ArrayList<>();

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    private double total = 0;

    public double getTotal() {
        return total;
    }

    public List<Produto> adicionarItens(Produto item) {
        carrinho.add(item);
        return carrinho;
    }

    public double somarProdutos() {
        for (Produto produto : getCarrinho()) {
            total = total + produto.getValor();
        }
        return total;
    }

    public void verItemsDoCarrinho() {
        System.out.println("Itens do carrinho:");
        for (Produto item : carrinho) {
            int i= 0;
            System.out.println("- " + item.getNome());
        }
    }
}