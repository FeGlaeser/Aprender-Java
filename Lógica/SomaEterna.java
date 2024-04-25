import java.util.Scanner;

public class SomaEterna {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] valores = new int[12];

        for (int x = 0; x != 12; x++) {
            System.out.printf("%d) valor: ",x + 1);
            valores[x] = leitor.nextInt();}
        
        while (true) {
            System.out.println("Digite dois valores correspondentes a posições na lista.");
            System.out.print("X: ");
            int x = leitor.nextInt();
            System.out.print("y: ");
            int y = leitor.nextInt();
            if (x == -1 || y == -1) {break;}
            limparMensagens();
            int total = valores[x - 1] + valores[y - 1];
            System.out.printf("%d + %d = %d\n", valores[x - 1], valores[y - 1], total);}

        leitor.close();
    }
    public static void limparMensagens() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
