import java.util.Scanner;

public class Dividir {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero a ser dividido: ");
        float dividido = leitor.nextFloat();

        System.out.println("Digite o divisor: ");
        float divisor = leitor.nextFloat();

        Boolean divisorZero = divisor == 0;

        if (divisorZero) {
            System.out.println("não existe número dividido por 0");
        } else {
            float resultado = dividido / divisor;
            System.out.printf("%.2f / %.2f = %.2f\n", dividido, divisor, resultado);
        }

        leitor.close();
    }
}
