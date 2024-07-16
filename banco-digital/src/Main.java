public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente com limite de cheque especial de R$ 500
        ContaCorrente contaCorrente = new ContaCorrente("12345", 500.0);
        contaCorrente.depositar(1000.0);
        contaCorrente.sacar(200.0);

        System.out.println("Saldo da conta corrente: R$" + contaCorrente.getSaldo());

        // Criando uma conta poupança com taxa de rendimento de 0.03 (3%)
        ContaPoupança contaPoupança = new ContaPoupança("67890", 0.03);
        contaPoupança.depositar(2000.0);
        contaPoupança.sacar(300.0);

        System.out.println("Saldo da conta poupança: R$" + contaPoupança.getSaldo());
    }
}