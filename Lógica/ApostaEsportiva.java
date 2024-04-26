import java.util.Random;
import java.util.Scanner;

public class ApostaEsportiva {
    public static void main(String[] args) {
        Random randola = new Random();
        Scanner leitor = new Scanner(System.in);

        int[][] vetorJogo = new int[13][3];
        int[] vetorG = new int[13];
        int simples = 0, duplas = 0, triplas = 0, pontos = 0, contador;

        for (int x = 0; x != vetorG.length; x ++) 
            vetorG[x] = randola.nextInt(2) + 1;

        System.out.println("Apenas zeros e uns ");

        for (int x = 0; x != vetorJogo.length; x ++) {
            System.out.printf("\nLinha %d: \n", x + 1);
            contador = 0;

            for (int y = 0; y != vetorJogo[0].length; y ++) {

                if (y == 0) 
                    System.out.print("Inicio: ");
                else if (y == 1) 
                    System.out.print("Meio: ");
                else 
                    System.out.print("Final: ");

                vetorJogo[x][y] = leitor.nextInt();
                contador += vetorJogo[x][y];}

            if (contador == 3) triplas ++;
            else if (contador == 2) duplas ++;
            else simples ++;
            if (vetorJogo[x][vetorG[x] - 1] == 1) pontos ++;}

            System.out.println("Pontos: " + pontos);
            System.out.println("Simples: " + simples);
            System.out.println("Duplas: " + duplas);
            System.out.println("Triplos: " + triplas);

        
        leitor.close();
    }
}
