import java.util.Scanner;

public class JogoWASD {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int[][] matriz = new int[10][10];
            int ws = 4, ad = 5;;

            while (true) {

                for (int x = 0; x != matriz.length; x ++)
                    for (int y = 0; y != matriz.length; y ++) {
                        matriz[x][y] = 0;
                        if (x == ws && y == ad) matriz[x][y] = 7;
                        System.out.print(matriz[x][y] + " ");
                        if (y == matriz.length - 1) System.out.println();}

                System.out.print("WASD para se movimentar: ");
                String move = leitor.next().toUpperCase();

                switch (move) {
                    case "W":
                        ws--;
                        if (ws == -1) ws = matriz.length - 1;
                        break;
                    case "S":
                        ws ++;
                        if (ws == matriz.length) ws = 0;
                        break;
                    case "A":
                        ad--;
                        if (ad == -1) ad = matriz.length - 1;
                        break;
                    case "D":
                        ad ++;
                        if (ad == matriz.length) ad = 0;
                        break;}}
        }
    }
    
}
