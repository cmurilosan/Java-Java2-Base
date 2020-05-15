package br.com.bytebank.main;

import br.com.bytebank.modelo.Conta;

public class TestaReferencias {

    public static void main(String[] args) {

        Conta terceiraConta = new Conta();
        terceiraConta.saldo = 300;

        System.out.println("Terceira conta tem " + terceiraConta.saldo + " de saldo");

        Conta quartaConta = terceiraConta;

        System.out.println("O saldo da quarta conta é " + quartaConta.saldo);

        quartaConta.saldo += 100;

        System.out.println("Quarta conta tem " + quartaConta.saldo + " de saldo");
        System.out.println("Terceira conta tem " + terceiraConta.saldo + " de saldo");

        //Referências a um mesmo objeto
        if(terceiraConta == quartaConta) {
            System.out.println("É a mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(terceiraConta);
        System.out.println(quartaConta);
    }
}
