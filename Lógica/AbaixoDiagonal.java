import java.util.Random;

public class AbaixoDiagonal {
    public static void main(String[] args) {
        Random randola = new Random();
        int[][] matriz = new int[10][10];

        for (int x = 0; x != matriz.length; x ++)
            for (int y = 0; y != matriz[x].length; y++)
                matriz[x][y] = randola.nextInt(9) + 1;

    
        for (int x = 0; x != matriz.length; x ++)
            for (int y = 0; y != matriz[x].length; y++) {
                if (y >= x)
                    System.out.print("    ");
                else System.out.printf("[%d] ", matriz[x][y]);
                if (y == matriz[x].length-1) System.out.println();}
                

    }   
}
