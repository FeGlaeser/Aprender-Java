import java.util.Random;
import java.util.Scanner;

public class MaiorElementoMatriz {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner leitor = new Scanner(System.in);
        int colunas, linhas;

        while (true) {
            System.out.print("Quantas linhas terá: ");
            linhas = leitor.nextInt();
            if (linhas <= 10) break;}
        
        while (true) {
            System.out.print("Quantas colunas terá: ");
            colunas = leitor.nextInt();
            if (colunas <= 10) break;}

        int[][] matriz = new int[linhas][colunas];
        int[] maior = new int[linhas];

        for (int x = 0; x != matriz.length; x++) {
            for (int y = 0; y != matriz[0].length; y ++){
                matriz[x][y] = randomizer.nextInt(8) + 1;
                System.out.printf("[%d] ", matriz[x][y]);
                if (matriz[x][y] > maior[x]) maior[x] = matriz[x][y];}
            System.out.printf("O maior é [%d]", maior[x]);
            System.out.println();}

    leitor.close();

    }
    
}
