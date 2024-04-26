import java.util.Scanner;


public class Exercicio55 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Conversor de Fahrenheit pra Celsius");
        System.out.print("Quantos Fahrenheit: ");
        double fahrenheit = leitor.nextDouble();

        Double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%f F = %f C", fahrenheit, celsius);

        leitor.close();
    }
    
}
