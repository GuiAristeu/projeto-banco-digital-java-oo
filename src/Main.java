public class Main {

    public static void main(String[] args) {
        Cliente guiAristeu = new Cliente();
        guiAristeu.setNome("Gui Aristeu");

        Conta contaCorrente = new ContaCorrente(guiAristeu);
        Conta contaPoupanca = new ContaPoupanca((guiAristeu));

        contaCorrente.depositar(250);
        contaCorrente.sacar(25);
        contaCorrente.transferir(100, contaPoupanca);

        contaPoupanca.sacar(25);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
