package Interface;

import Entities.Conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
