import java.util.Scanner;

public class TrocaVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int memoria;

        int[] listaValores = new int[20];

        System.out.println("Digite 20 valores: ");

        for (int index = 0; index != listaValores.length; index ++) {
            System.out.printf("Digite º%d valor: ", index + 1);
            listaValores[index] = leitor.nextInt();}

        for (int index = 0; index != (listaValores.length / 2); index ++) {
            memoria = listaValores[index];
            listaValores[index] = listaValores[(listaValores.length / 2) + index];
            listaValores[(listaValores.length / 2) + index] = memoria;}

        for (int index = 0; index != listaValores.length; index ++) {
            System.out.printf("posição %d, número %d\n", index + 1, listaValores[index]);}
        
        

        leitor.close();
    }
}
