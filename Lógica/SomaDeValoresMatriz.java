import java.util.Scanner;
import java.util.Random;

public class SomaDeValoresMatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randola = new Random();

        int[][] matriz = new int[5][5];

        for (int x = 0; x != matriz.length; x ++) 
            for (int y = 0; y != matriz[0].length; y ++) {
                matriz[x][y] = randola.nextInt(8) + 1;
                System.out.printf("[%d] ",matriz[x][y]);
                if (y == matriz[0].length - 1) System.out.println();}


        int somaHorizontal = 0, somaVertical = 0, somaE = 0, somaD = 0, soma = 0;
        for (int x = 0; x != matriz.length; x ++) {
            for (int y = 0; y != matriz[0].length; y ++) {
                if (x == y) somaE += matriz[x][y];
                if (y == matriz[0].length - 1 - x) somaD += matriz[x][y];
                soma += matriz[x][y];
                if (x == 1) somaHorizontal += matriz[x][y];
                if (y == 0) somaVertical += matriz[x][y];}}

        System.out.println("soma: " + soma);
        System.out.println("somaE: " + somaE);
        System.out.println("somaD: " + somaD);
        System.out.println("somaVertical: " + somaVertical);
        System.out.println("somaHorizontal: " + somaHorizontal);

        leitor.close();  
    }
}