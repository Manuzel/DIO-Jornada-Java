import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main (String [] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println("Seu saldo atual é: "+saldo);
        scanner.close();
    }
}
