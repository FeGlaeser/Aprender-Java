import java.util.Scanner;

public class ZeroDiagonal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int x = 0; x != matriz.length; x ++)
            for (int y = 0; y != matriz[x].length; y ++) {
                if (y == x) {
                    matriz[x][y] = 0;
                    continue; }
                System.out.printf("[%d] X [%d]: ", x + 1, y + 1);
                matriz[x][y] = leitor.nextInt();}

        for (int x = 0; x != matriz.length; x ++)
            for (int y = 0; y != matriz[x].length; y ++) {
                System.out.printf("[%d] ", matriz[x][y]);
                if (y == matriz[x].length - 1) System.out.println();}

        leitor.close();
    }
    
}
