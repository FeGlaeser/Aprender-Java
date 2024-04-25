import java.util.Scanner;
import java.util.Random;

public class TrocaLinhas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randola = new Random();

        int[][] matriz = new int[10][10];

        for (int x = 0; x != matriz.length; x ++) 
            for (int y = 0; y != matriz.length; y ++)
                matriz[x][y] = randola.nextInt(8) + 1;

 
        
        printa(matriz);
        int momemoria = 0;
        for (int x = 0; x != matriz.length; x ++){
            momemoria = matriz[1][x];
            matriz[1][x] = matriz[7][x];
            matriz[7][x] = momemoria;}
        
        printa(matriz);

        for (int x = 0; x != matriz.length; x ++){
            momemoria = matriz[x][3];
            matriz[x][3] = matriz[x][9];
            matriz[x][9] = momemoria;}

        printa(matriz);

        for (int x = 0; x != matriz.length; x ++) {
                momemoria = matriz[x][x];
                matriz[x][x] = matriz[x][matriz.length - 1 - x];
                matriz[x][matriz.length - 1 - x] = momemoria;}
        
        printa(matriz);
        
                    
        leitor.close();
    }
    public static void printa(int[][] lista) {
        for (int x = 0; x != lista.length; x ++) 
            for (int y = 0; y != lista.length; y ++){
                System.out.printf("[%d] ", lista[x][y]);
                if (y == lista.length - 1) System.out.println();}
        System.out.println();
    }
}
