// Classe derivada: ContaPoupança
public class ContaPoupança extends Conta {
    private double taxaRendimento;

    public ContaPoupança(String numero, double taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    // Métodos específicos da conta poupança
    // ...
}