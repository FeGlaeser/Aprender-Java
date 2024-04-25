import java.util.Scanner;

public class QuadradoMagico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int x = 0; x != matriz.length; x ++) 
            for (int y = 0; y != matriz[x].length; y ++) {
                System.out.printf("Valor de [%d] X [%d]: ", x + 1, y + 1);
                matriz[x][y] = leitor.nextInt();}
        
        boolean perfeito = true;

        int SomaDiagonalE = 0, SomaDiagonalD = 0;
        int somaLinha = 0;
        int memoria = 0, somaColuna = 0;
        for (int x = 0; x != matriz.length; x ++){
            for (int y = 0; y != matriz[x].length; y ++) {

                if (x == y) SomaDiagonalE += matriz[x][y];

                if (matriz[x].length - 1 - x == y) SomaDiagonalD += matriz[x][y];

                somaLinha += matriz[x][y];
                somaColuna += matriz[y][x];}

            if (x == 0) {
                memoria = somaLinha;}

            else {
                if (somaLinha != memoria) {
                    perfeito = false;
                    break;}

                if (somaColuna != memoria) {
                    perfeito = false;
                    break;}}
                
            somaColuna = 0;
            somaLinha = 0;}
        
        if (perfeito)
            if (SomaDiagonalD != SomaDiagonalE || SomaDiagonalD != memoria)
                    perfeito = false;

        if (perfeito)
            System.out.print("É sim perfeito");
        else
            System.out.print("Não é perfeito");

        leitor.close();
        
    }
    
}
