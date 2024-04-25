import java.util.Scanner;
import java.util.Random;

public class Chute {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[] {random.nextInt(100),random.nextInt(100),random.nextInt(100),
            random.nextInt(100),random.nextInt(100)};

        for (int x = 0; x != numeros.length; x ++) {
            while (true) {
            System.out.printf("º%d número chute aí: ", x+1);
            int chute = leitor.nextInt();
            clearMensagens();
            if (chute == numeros[x]) {break;}
            else if (chute > numeros[x]) {System.out.println("Mais pra Baixo.");}
            else {System.out.println("Mais pra Cima.");}}}
        
        leitor.close();
    }
    public static void clearMensagens() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }    
}
