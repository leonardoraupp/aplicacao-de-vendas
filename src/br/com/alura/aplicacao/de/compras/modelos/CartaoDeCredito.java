package br.com.alura.aplicacao.de.compras.modelos;

import java.util.Scanner;

public class CartaoDeCredito {
    private double saldo;
    private double limite;

    private double valorDaCompra;
    private Scanner leitorDeDados = new Scanner(System.in);

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getSaldo() {
        return saldo;
    }

    public double configurarLimite() {
       System.out.println("Insira o limite do seu cartão");
       double limite = leitorDeDados.nextDouble();
       setLimite(limite);
       saldo = limite;
      return getLimite();
    }

    public double aprovarCompra(Carrinho carrinho) {
        if (carrinho.getTotal() > getLimite()) {
            System.out.println("Limite insuficiente para realizar a compra");
        } else if (carrinho.getTotal() > getSaldo()) {
            System.out.println("Saldo insuficiente para realizar a compra");
        } else {
            System.out.println("Compra aprovada");
            double compra = getLimite() - carrinho.getTotal();
            saldo = limite - compra;
        }
        return  limite;
    }
}
