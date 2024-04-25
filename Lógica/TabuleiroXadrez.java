import java.util.Scanner;

public class TabuleiroXadrez {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para o xadrez: ");
        int numero = leitor.nextInt();

        int[][] matriz = new int[numero][numero];

        for (int x = 0; x != matriz.length; x ++) {
            for (int y = 0; y != matriz[x].length; y ++) {
                if (x % 2 == 0)
                    if (y % 2 == 0) matriz[x][y] = 0;
                    else matriz[x][y] = 1;
                else
                    if (y % 2 == 0) matriz[x][y] = 1;
                    else matriz[x][y] = 0;
            System.out.printf("[%d] ", matriz[x][y]);
            if (y == matriz[x].length - 1) System.out.println();}}
        
        leitor.close();
    }
    
}
