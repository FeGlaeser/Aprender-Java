import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a Largura do retangulo? ");
        float Largura = leitor.nextFloat();

        System.out.print("Qual o Comprimento do retangulo? ");
        float Comprimento = leitor.nextFloat();

        float Area = Largura * Comprimento;
        float perimetro = Largura * 2 + Comprimento * 2;

        System.out.printf("A area do retangulo é: %.2f", Area);
        System.out.printf("O perimetro do retangulo é: %.2f\n", perimetro);
        leitor.close();
    }
}