import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos números terão a sequencia: ");
        int QuantiaNumeros = leitor.nextInt();

        int[] numeros = new int[QuantiaNumeros];
        
        for (int x = 0; x != QuantiaNumeros; x++) {
            System.out.printf("Qual o %d número: ", x+1);
            numeros[x] = leitor.nextInt();}
        
        for (int index = QuantiaNumeros - 1; index != -1; index-- ) {
            if (index != 0) {System.out.printf("%d, ",numeros[index]);}
            else {System.out.printf("%d. ",numeros[index]);}}
        
        leitor.close();
    }
}