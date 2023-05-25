package br.com.alura.aplicacao.de.compras.modelos;

import java.util.Scanner;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

//    private double valorDaCompra;
//    private Scanner leitorDeDados = new Scanner(System.in);

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

//    public double configurarLimite() {
//       System.out.println("Insira o limite do seu cartão");
//       double limite = leitorDeDados.nextDouble();
//       setLimite(limite);
//      return getLimite();
//    }

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
