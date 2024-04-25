import java.util.Scanner;

public class SomaDoisMaiores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

            System.out.print("Valor 1 = ");
            int valor1 = leitor.nextInt();

            System.out.print("Valor 2 = ");
            int valor2 = leitor.nextInt();

            System.out.print("Valor 3 = ");
            int valor3 = leitor.nextInt();

            if (valor1 <  valor2 & valor1 < valor3) {
                int soma = valor2 + valor3;
                System.out.printf("%d & %d são os maiores %d é a soma", valor2, valor3, soma);
            } else if (valor2 < valor1 & valor2 < valor3) {
                int soma = valor3 + valor1;
                System.out.printf("%d & %d são os maiores %d é a soma", valor3, valor1, soma);
            } else {
                int soma = valor2 + valor1;
                System.out.printf("%d & %d são os maiores %d é a soma", valor1, valor2, soma);
            }

        leitor.close();
    }
}
