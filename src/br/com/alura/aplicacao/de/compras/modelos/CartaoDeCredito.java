package br.com.alura.aplicacao.de.compras.modelos;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private boolean compraAprovada;
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isCompraAprovada() {
        return compraAprovada;
    }

    public double aprovarCompra(Carrinho carrinho) {
        if (getSaldo() > carrinho.getValorTotal()) {
            System.out.println("Compra aprovada");
            saldo -= carrinho.getValorTotal();
            compraAprovada = true;
            } else {
            System.out.println("Limite insuficiente para realizar a compra.");
            compraAprovada = false;
        }
        return  saldo;
    }
}
