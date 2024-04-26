import java.util.Scanner;
import java.util.Random;

public class InversaoDeMatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randomizer = new Random();

        int colunas, linhas;

        while (true) {
            System.out.print("Quantas linhas será? ");
            linhas = leitor.nextInt();
            if (linhas >= 1 && linhas <= 10) break;}

        while (true) {
            System.out.print("Quantas colunas será? ");
            colunas = leitor.nextInt();
            if (colunas >= 1 && colunas <= 10) break;}

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizT = new int[colunas][linhas];

        for (int x = 0; x != matrizA.length; x ++)
            for (int y = 0; y != matrizA[0].length; y ++) {
                matrizA[x][y] = randomizer.nextInt(8) + 1;
                System.out.printf("[%d] ", matrizA[x][y]);
                if (y == matrizA[0].length - 1) System.out.println();}
        
        System.out.print("\n\n");
        
        for (int x = 0; x != matrizT.length; x ++)
            for (int y = 0; y != matrizT[0].length; y ++) {
                matrizT[x][y] = matrizA[y][x];
                System.out.printf("[%d] ", matrizT[x][y]);
                if (y == matrizT[0].length - 1) System.out.println();}
        
        leitor.close();

    }
    
}
