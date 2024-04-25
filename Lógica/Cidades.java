import java.util.Scanner;

public class Cidades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final float crescimentoA = 0.03f;
        final float crescimentoB = 0.015f;
        int anos = 0;

        System.out.print("Quantos habitantes tem o pais A: ");
        int paisA = leitor.nextInt();

        System.out.print("Quantos habitantes tem o pais B: ");
        int paisB = leitor.nextInt();
        
        while (paisA < paisB) {
            paisA = (int)(paisA + (paisA * crescimentoA));
            paisB = (int)(paisB + (paisB * crescimentoB));
            anos ++;
        }

        System.out.printf("demorará %d anos até o pais A passar o pais B\n", anos);
        System.out.printf("pais A : %d pais B: %d\n", paisA, paisB);

        leitor.close();
    }
    
}
