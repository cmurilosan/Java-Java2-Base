package br.com.bytebank.main;

import br.com.bytebank.modelo.Conta;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoFulano = new Conta();
        contaDoFulano.saldo = 100;
        contaDoFulano.deposita(50);

        System.out.println(contaDoFulano.saldo);

        boolean conseguiuRetirar = contaDoFulano.saca(20);

        System.out.println(contaDoFulano.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDoCiclano = new Conta();
        contaDoCiclano.deposita(1000);

        System.out.println(contaDoCiclano.saldo);

        if (contaDoCiclano.transfere(300, contaDoFulano)) {
            System.out.println("Transferência com sucesso!");
        } else {
            System.out.println("Faltou dinheiro!");
        }

        System.out.println(contaDoCiclano.saldo);
        System.out.println(contaDoFulano.saldo);

    }
}
