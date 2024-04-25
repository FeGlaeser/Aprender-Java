import java.util.Random;

public class DiferencaEsomaMatriz {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int[][] matrizA = new int[3][5];
        int[][] matrizB = new int[3][5];
        int[][] matrizSoma = new int[3][5];
        int[][] matrizDiferenca = new int[3][5];

        for (int x = 0; x != matrizA.length; x ++)
            for (int y = 0; y != matrizA[0].length; y ++) {
                matrizA[x][y] = randomizer.nextInt(8) + 1;
                matrizB[x][y] = randomizer.nextInt(8) + 1;}
        
         for (int x = 0; x != matrizA.length; x ++)
            for (int y = 0; y != matrizA[0].length; y ++) {
                matrizSoma[x][y] = matrizB[x][y] + matrizA[x][y];
                matrizDiferenca[x][y] = matrizA[x][y] - matrizB[x][y];}

        for (int z = 1; z != 5; z ++){
            System.out.println();
            for (int x = 0; x != matrizA.length; x ++)
                for (int y = 0; y != matrizA[0].length; y ++) {
                    if (z == 1) {
                        System.out.printf("[%d] ", matrizA[x][y]);
                        if (y == matrizA[0].length - 1) System.out.println();}
                    else if (z == 2) {
                        System.out.printf("[%d] ", matrizB[x][y]);
                        if (y == matrizA[0].length - 1) System.out.println();}
                    else if (z == 3) {
                        System.out.printf("[%d] ", matrizSoma[x][y]);
                        if (y == matrizA[0].length - 1) System.out.println();}
                    else if (z == 4) {
                        System.out.printf("[%d] ", matrizDiferenca[x][y]);
                        if (y == matrizA[0].length - 1) System.out.println();}}}
        
    }
    
}
