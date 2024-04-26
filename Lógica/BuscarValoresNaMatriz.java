import java.util.Scanner;
import java.util.Random;

public class BuscarValoresNaMatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.print("Digite um número de Linhas: ");
        int linhas = leitor.nextInt();

        System.out.print("Digite um número de Colunas: ");
        int colunas = leitor.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int x = 0; x != matriz.length; x++)
                for (int y = 0; y != matriz[0].length; y ++) 
                    matriz[x][y] = randomizer.nextInt(8) + 1;
    
        while (true) {
            boolean tem = false;
            for (int x = 0; x != matriz.length; x++)
                for (int y = 0; y != matriz[0].length; y ++) {
                    System.out.printf("[%d]", matriz[x][y]);
                    if (y == matriz[0].length - 1) System.out.println();}
            System.out.println();
            System.out.print("digite um valor: ");
            int valor = leitor.nextInt();

            if (valor < 0) break;

            for (int x = 0; x != matriz.length; x++)
                for (int y = 0; y != matriz[0].length; y ++) {
                    if (matriz[x][y] == valor) {
                        System.out.print("Tem");
                        tem = true;
                        break;}}
            
            if (!tem) System.out.print("não tem");}
        leitor.close();
        }
}
