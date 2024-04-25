import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int x = 0; x != 10; x++) {
            System.out.printf("%d) valor: ", x + 1);
            numeros[x] = leitor.nextInt();}
        
        while (true) {
            clearMensagens();
            for (int numero = 0; numero != numeros.length; numero ++) {
                if (numero == 4) {
                    System.out.printf("[%d] \n", numeros[numero]);
                    continue;}
                System.out.printf("[%d] ", numeros[numero]);}
        
            System.out.print("\nQual posição você deseja trocar [1 a 10]: ");
            int pos1 = leitor.nextInt() - 1;
            System.out.print("Por qual posição [1 a 10]:");
            int pos2 = leitor.nextInt() - 1;
            
            if (pos1 == -1 || pos2 == -1) {break;}

            int memoria = numeros[pos1];
            numeros[pos1] = numeros[pos2];
            numeros[pos2] = memoria;
        }

        leitor.close();
    } 
    public static void clearMensagens() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
