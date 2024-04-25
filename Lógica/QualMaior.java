import java.util.Scanner;

public class QualMaior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        float primeiroValor = leitor.nextFloat();

        System.out.println("Digite o Segundo valor: ");
        float segundoValor = leitor.nextFloat();

        Boolean PrimeiroMaior = primeiroValor > segundoValor;

        if (PrimeiroMaior) {
            System.out.printf("O primeiro valor é maior: %.2f > %.2f", primeiroValor, segundoValor);
        } else {
            System.out.printf("O Segundo valor é maior: %.2f > %.2f", segundoValor, primeiroValor);
        }
        leitor.close();
    }
}
