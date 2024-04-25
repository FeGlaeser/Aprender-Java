import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número ");
        int numeroUm = leitor.nextInt();

        int dobro = numeroUm * 2;

        
        while (dobro > numeroUm) {
        dobro = numeroUm * 2;

        System.out.print("Digite um número ");
        numeroUm = leitor.nextInt(); }

        System.out.print("Fim");    

        leitor.close();
    }
}
