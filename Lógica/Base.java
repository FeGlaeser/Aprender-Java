import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vinteValores = new int[20];

        for (int i = 0; i != vinteValores.length; i ++) {
            System.out.printf("Digite o º%d Valor: ",i + 1);
            vinteValores[i] = leitor.nextInt();}
        
        System.out.print("Qual será a base: ");
        int base = leitor.nextInt();

        for (int numero = 0; numero != vinteValores.length; numero ++){
            if (vinteValores[numero] == base) {
                System.out.printf("O º%d [%d] é igual a %d\n",numero + 1,vinteValores[numero], base);}
            else if (vinteValores[numero] > base) {
                System.out.printf("O º%d [%d] é Maior que %d\n",numero + 1,vinteValores[numero], base);} 
            else {System.out.printf("O º%d [%d] é Menor que %d\n",numero + 1,vinteValores[numero], base);} 
        }


        leitor.close();
    }
}
