import java.util.Scanner;

public class Natalidade {
    public static void main(String[] args){
        Scanner Leitor = new Scanner(System.in);
        Float TaxaNatalidadeA = 0.03f; Float TaxaNatalidadeB = 0.02f;
        int Anos = 0;

        System.out.print("Quantos habitantes tem o pais A: ");
        int PaisA = Leitor.nextInt();

        System.out.print("Quantos habitantes tem o pais B: ");
        int PaisB = Leitor.nextInt();

        while (PaisA < PaisB) {
            PaisA = (int) (PaisA + (PaisA * TaxaNatalidadeA));
            PaisB = (int) (PaisB + (PaisB * TaxaNatalidadeB));
            Anos += 1;
        }

        System.out.printf("Vai demorar %d Anos", Anos);
        Leitor.close();
    }  
}