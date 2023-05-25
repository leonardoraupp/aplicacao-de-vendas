package br.com.alura.aplicacao.de.compras.modelos;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double aprovarCompra(Carrinho carrinho) {
        if (getSaldo() > carrinho.getValorTotal()) {
            System.out.println("Compra aprovada");
            saldo -= carrinho.getValorTotal();
            } else {
            System.out.println("Limite insuficiente para realizar a compra");
        }
        return  saldo;
    }
}
