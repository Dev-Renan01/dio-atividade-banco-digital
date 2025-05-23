package ContaBanco;

public class Main {
    public static void main(String[] args) {
            Cliente Thiago = new Cliente();
        Thiago.setNome("Thiago");

            Conta cc = new ContaCorrente(Thiago);
            Conta poupanca = new ContaPoupanca(Thiago);

            cc.depositar(100);
            cc.transferir(50, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();

            cc.consultarSaldo();
    }
}