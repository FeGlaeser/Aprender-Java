import java.util.Scanner;


public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\tCalculadora Churrasco\n");

        System.out.print("Quantos Homens vão: ");
        int homens = leitor.nextInt();
        int homens_total = homens * 400;

        System.out.print("Quantas Mulheres vão: ");
        int mulheres = leitor.nextInt();
        int mulheres_total = mulheres * 320;

        System.out.print("Quantas Crianças vão: ");
        int crianca = leitor.nextInt();
        int criancas_total = crianca * 200;

        int total = (criancas_total) + (mulheres_total) + (homens_total);   
        int total_seguro = total + total * 100 / 5;

        System.out.println("\n\tResultado final:");
        System.out.printf("Homens: %d X 400 = %d G\n", homens, homens_total);
        System.out.printf("Mulheres: %d X 320 = %d G\n", mulheres, mulheres_total);
        System.out.printf("Crianças: %d X 200 = %d G\n", crianca, criancas_total);
        System.out.printf("soma = %d\nTotal = soma X 0.20 = %d G", total, total_seguro);

        leitor.close();
    }
}
