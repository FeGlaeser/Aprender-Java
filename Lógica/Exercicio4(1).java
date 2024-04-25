import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Para calcular a Area do triangulo informe: ");

        System.out.print("Qual a medida da altura do Triangulo? ");
        double altura = leitor.nextDouble();

        System.out.print("Qual a medida da Base do Triangulo? ");
        double base = leitor.nextDouble();

        double area = (altura * base) / 2;
        System.out.printf("A area desse Triangulo é %f", area);

        leitor.close();
    }
}