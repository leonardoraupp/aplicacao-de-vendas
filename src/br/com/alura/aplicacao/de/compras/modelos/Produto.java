package br.com.alura.aplicacao.de.compras.modelos;

public class Produto {
    private static String descricao;
    private static double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public static String getDescricao() {
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
}
