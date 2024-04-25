import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        float Saldo = 0.00f;

        while (true) {
            System.out.print("\nconsulta saldo (a)\nsaque (b)\ndepósito (c)\nsair (d)\n");
            String Escolha = Leitor.next();
            if (Escolha.equalsIgnoreCase("A")) {
                System.out.printf("Seu saldo é: %.2f R$", Saldo);
            } else if (Escolha.equalsIgnoreCase("B")) {
                System.out.print("Quanto você quer sacar da conta: ");
                float Saque = Leitor.nextFloat();

                if (Saldo < Saque) {
                    System.out.print("Erro, você não possui saldo o suficiente.");
                } else {
                    System.out.print("Seu Saque foi efetuado.");
                    Saldo -= Saque;
                }
            } else if (Escolha.equalsIgnoreCase("C")) {
                System.out.print("Quanto você quer Depositar na conta: ");
                float Deposito = Leitor.nextFloat();
                Saldo += Deposito;
            } else if (Escolha.equalsIgnoreCase("D")) {
                break;
            } else {
                System.out.print("Não entendi tente de novo.");
            }
        }
        System.out.print("Tchau até mais.");
        Leitor.close();
    }
    
}
