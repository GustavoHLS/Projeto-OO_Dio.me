package Entities;

import Interface.IConta;
import lombok.Data;

@Data
public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;
    private final int numero;
    private double saldo;
    private final Cliente cliente;
    private final Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    private int getAgencia() {
        return 1;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Valor maior do saque maior do que o disponível em conta.");
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        String str = "=== EXTRATO DA CONTA ===\n\r";
        str += "Banco: " + this.getBanco().nome + " Agencia: " + this.getAgencia() + " Número: " + this.getNumero() + ".\n\r";
        str += "Saldo: " + this.getSaldo() + ".";
        System.out.println(str);
    }
}