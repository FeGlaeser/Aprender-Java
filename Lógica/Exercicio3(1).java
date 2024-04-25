import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int quadrado = numero * numero;

        System.out.printf("O quadrado de %d é: %d ", numero, quadrado);

        leitor.close();
    }
}