package Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String nome;
    private String CPF;
    private Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
    }

    private int getNumeroConta(){
        return conta.getNumero();
    }

    public void criarContaCorrente(Cliente cliente,Banco banco) {
        this.conta = new ContaCorrente(cliente, banco);
        banco.clientes.add(cliente);
    }
    public void criarContaPoupanca(Cliente cliente,Banco banco) {
        this.conta = new ContaPoupanca(cliente, banco);
        banco.clientes.add(cliente);
    }

   @Override
    public String toString(){
        String str = "Nome: " + this.getNome() + "\n\r";
        str += "Cpf: " + this.getCPF() + "\n\r";
        str += "Conta: " + this.getNumeroConta() + "\n\r";
        return str;
    }

}
