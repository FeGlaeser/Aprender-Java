import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quanto você tirou na primeira prova? ");
        double nota1 = leitor.nextDouble();

        System.out.print("E na segunda? ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.printf("A sua média foi de: %f", media);

        leitor.close();
    }
}
