import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem-vindo ao seu banco digital. \n\n Por favor, digite seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agora digite o número da CONTA!");
        int numero = scanner.nextInt();

        System.out.println("Agora digite o número da sua AGÊNCIA:");
        String agencia = scanner.next();

        System.out.println("Agora digite seu SALDO:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+", conta "+numero +" e seu saldo " + saldo +" já está disponível para saque.");

        scanner.close();

       



    }
}
