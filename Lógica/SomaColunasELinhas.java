import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas linhas: ");
        int linhas = leitor.nextInt();

        System.out.print("Quantas colunas: ");
        int colunas = leitor.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int[] somaLinhas = new int[linhas];
        int[] somaColunas = new int[colunas];

        for (int x = 0; x != matriz.length; x ++) 
            for (int y = 0; y != matriz[0].length; y ++) {
                matriz[x][y] = randomizer.nextInt(8) + 1;
                System.out.printf("[%d] ",matriz[x][y]);
                if (y == matriz[0].length - 1) System.out.println();
                somaLinhas[x] += matriz[x][y];
                somaColunas[y] += matriz[x][y];}
        

        for (int x = 0; x != matriz.length; x ++) 
            System.out.printf("A soma da linha %d é: %d \n", x + 1, somaLinhas[x]);
        for (int y = 0; y != matriz[0].length; y++)
            System.out.printf("A soma da coluna %d é: %d \n", y + 1, somaColunas[y]);

        leitor.close();
    }
    
}
