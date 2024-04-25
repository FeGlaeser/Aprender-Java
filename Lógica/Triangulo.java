import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos linhas no triangulo: ");
        int linhas = leitor.nextInt();

        int quantidade = 1 + 2 * (linhas - 1);
        int espaco = 0;

        for (int j = linhas ; j != 0; j --) {
            for (int y = espaco; y != 0; y --) {System.out.print("  ");}
            for (int x = 0; x != quantidade; x ++) {System.out.print("* ");}
            System.out.println("");
            quantidade -= 2;
            espaco += 1;}
    


        leitor.close();
    } 
}
