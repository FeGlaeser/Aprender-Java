import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][][] matriz = new int[2][3][3];

        for (int x = 0; x != matriz.length; x ++) 
            for (int y = 0; y != matriz[x].length; y ++) 
                for (int z = 0; z != matriz[x][y].length; z++) {
                    System.out.printf("Matriz %d) [%d]X[%d]: ", x + 1, z + 1, y + 1);
                    matriz[x][y][z] = leitor.nextInt();}
        
        for (int x = 0; x != matriz[0].length; x ++) 
            for (int y = 0; y != matriz[0][x].length; y ++) {
                    System.out.printf("[%d] ",matriz[0][x][y] + matriz[1][x][y]);
                    if (y == 2) System.out.println();}

        leitor.close();

    }
}
