import java.util.Scanner;

public class Fibonaccia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroUm = 0; int numeroDois = 1; int total = 0;

        System.out.print("Quer ver os números da sequencia até que valor: ");
        int limite = leitor.nextInt();

        while (true) {
            System.out.print(numeroUm +", ");
            total = numeroUm + numeroDois;
            numeroUm = numeroDois; 
            numeroDois = total;
            if (numeroUm > limite) {break;}
        }
        leitor.close();
    }
}