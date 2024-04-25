import java.util.Random;

public class AcimaDiagonal {
    public static void main(String[] args) {
        Random randola = new Random();
        int[][] matriz = new int[10][10];

        for (int x = 0; x != matriz.length; x ++)
            for (int y = 0; y != matriz[x].length; y ++) 
                matriz[x][y] = randola.nextInt(8) + 1;

        for (int x = 0; x != matriz.length; x ++)
            for (int y = 0;y != matriz[x].length; y ++) {
                if (x < y) System.out.print("    ");
                else System.out.printf("[%d] ", matriz[x][y]);
                if (y == 9) System.out.println();}


    }
    
}
