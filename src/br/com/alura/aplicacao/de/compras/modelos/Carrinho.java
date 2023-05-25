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
        System.out.println("Itens do carrinho no metodo "+ carrinho);
        return carrinho;
    }

    public double somarProdutos() {
        for (Produto produto : getCarrinho()) {
            total = total + produto.getValor();
        }
        System.out.println("Total dos items: " + total);
        return total;
    }

    public void verItemsDoCarrinho() {
        for (Produto item : carrinho) {
            System.out.println("Item: " + item.getNome());
        }
    }
}