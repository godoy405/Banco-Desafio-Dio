package br.com.dio;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta ContaDestino);
}
