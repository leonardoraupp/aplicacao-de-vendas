package br.com.alura.aplicacao.de.compras.modelos;

public class Produto implements  Comparable<Produto> {
    private String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto: descrição = " + descricao +
                " valor = " + valor;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outroProduto.getValor())) ;
    }
}
