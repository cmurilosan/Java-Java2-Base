package br.com.bytebank.main;

import br.com.bytebank.modelo.Conta;

public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem " + primeiraConta.saldo + " de saldo");
        System.out.println("Segunda conta tem " + segundaConta.saldo + " de saldo");

        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;

        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("É a mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
