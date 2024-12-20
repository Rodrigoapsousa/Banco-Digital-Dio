public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco do Povo");

        Cliente cliente1 = new Cliente("João Silva", "111.222.333-44");
        Cliente cliente2 = new Cliente("Maria Oliveira", "555.666.777-88");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(200, contaPoupanca);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        banco.listarClientes();
    }
}
