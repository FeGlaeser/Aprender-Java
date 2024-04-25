import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o tamanho dos: ");
        int tamanho = leitor.nextInt();
        
        int[] vetorUm = new int[tamanho];
        int[] vetorDois = new int[tamanho];

        for (int y = 0; y != tamanho; y++) {
            System.out.printf("Lista [1] Número [%d]: ", y + 1);
            vetorUm[y] = leitor.nextInt();}

        for (int x = 0; x != tamanho; x++) {
            System.out.printf("Lista [2] Número [%d]: ", x + 1);
            vetorDois[x] = leitor.nextInt();}

        for (int index = 0; index != tamanho; index++) {
            vetorUm[index] = vetorDois[index] + vetorUm[index];
            System.out.println(vetorUm[index]);}

        leitor.close();
    }
}
