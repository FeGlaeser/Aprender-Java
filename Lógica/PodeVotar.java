import java.util.Scanner;

public class PodeVotar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int AnoAtual = 2024;
        final int IdadeVotar = 16;

        System.out.print("Em que ano você nasceu? ");
        int AnoNascimento = leitor.nextInt();

        boolean PodeVotar = AnoAtual - AnoNascimento >= IdadeVotar;

        if (PodeVotar) {
            System.out.print("Você pode votar.");
        } else {
            System.out.print("Você não pode votar ainda.");
        }
        leitor.close();
    }    
}
