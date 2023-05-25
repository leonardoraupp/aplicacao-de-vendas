package br.com.alura.aplicacao.de.compras.modelos;

public class Produto {
    private static String nome;
    private static double valor;
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

    @Override
    public String toString() {
        return "Produto {" +
                " nome:" + getNome() +
                " valor:" + getValor() +
                " }";
    }
}
