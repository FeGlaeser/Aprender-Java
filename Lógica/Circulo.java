import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final float pi = 3.141692f;

        System.out.print("Qual raio de uma circunferência? ");
        float raio = leitor.nextFloat();

        float diametro = 2 * raio;
        float Comprimento = 2 * pi * raio;
        float area = pi * (raio * raio);

        System.out.printf("O diametro dela é: %.2f\nO Comprimentro dela é: %.2f\nA area dela é: %.2f\n",
        diametro, Comprimento, area );
         
         leitor.close();
    } 
}
