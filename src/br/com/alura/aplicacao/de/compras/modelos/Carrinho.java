package br.com.alura.aplicacao.de.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    public Carrinho() {
        this.carrinho = new ArrayList<>();
    }

    private List<Produto> carrinho;
    private double valorTotal = 0;

    public List<Produto> getCarrinho() {
        return carrinho;
    }

//    public void setCarrinho(List<Produto> carrinho) {
//        this.carrinho = carrinho;
//    }


    public double getValorTotal() {
        return valorTotal;
    }

//    public List<Produto> adicionarItens(Produto item) {
//        List <Produto> produtos = new ArrayList<>();
//        produtos.add(item);
//        carrinho.addAll(produtos);
////        carrinho.add(item);
//        return carrinho;
//    }
    public void adicionarAoCarrinho(Produto item) {
        carrinho.add(item);
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