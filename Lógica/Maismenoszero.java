import java.util.Scanner;

public class Maismenoszero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = leitor.nextInt();

        if (valor == 0) {
            System.out.print("VALOR É 0");
        } else if (valor > 0) {
            System.out.print("VALOR POSITIVO");
        } else {
            System.out.print("VALOR NEGATIVO");
        }
        leitor.close();
    }
}