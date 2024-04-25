import java.util.Scanner;

public class PorraVini {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] dezValores = new int[10];
        int[] outrosVinte = new int[10];
        int soma = 0;


        System.out.println("Digite os 10 valores: ");

        for (int x = 0; x != dezValores.length; x++) {
            System.out.printf("Digite o º%d Valor: ",x + 1);
            dezValores[x] = leitor.nextInt();}

        for (int x = 0; x != dezValores.length; x ++) {
            for (int index = x; index != -1; index -- ) 
            {soma += dezValores[index];}
            outrosVinte[x] = soma;
            soma = 0;}

            for (int x = 0; x != dezValores.length; x ++) {
                System.out.println(outrosVinte[x]);
            }

        leitor.close();
    }
    
}
