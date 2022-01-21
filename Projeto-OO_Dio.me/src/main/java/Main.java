import Entities.*;
public class Main {
    public static void main(String[] args) {

        Banco Inter = new Banco("Inter");

        Cliente maria = new Cliente("Maria", "369.258.147-54");
        Cliente thais = new Cliente("Thais", "741.852.963-62");
        Cliente gustavo = new Cliente("Gustavo", "123.456.789-01");
        Cliente joao = new Cliente("João", "987.654.321-02");

        gustavo.criarContaCorrente(gustavo, Inter);
        joao.criarContaCorrente(joao, Inter);

        thais.criarContaPoupanca(thais, Inter);
        maria.criarContaPoupanca(maria, Inter);

        for(Cliente cliente : Inter.clientes){
            System.out.println(cliente);
        }

        gustavo.getConta().depositar(103.27);
        joao.getConta().depositar(500);

        joao.getConta().transferir(gustavo.getConta(), 400);

        gustavo.getConta().imprimirExtrato();

        joao.getConta().imprimirExtrato();
    }
}