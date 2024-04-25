import java.util.Scanner;


public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor Inteiro: ");
        int valor = leitor.nextInt();

        Boolean positivo = valor >= 0;
        if (positivo) {
            System.out.printf("%d é um valor postivo", valor);
        } else {
            System.out.printf("%d é um valor Negativo", valor);
        }
        leitor.close();
    }
}
