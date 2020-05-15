package br.com.bytebank.modelo;

public class Conta {

    //Atributos públicos
    public double saldo;
    public int agencia = 42;
    public int numero;
    public String titular;

    //Métodos
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

}
