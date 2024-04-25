import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int duzia = 12;
        
        System.out.print("Quantas maçãs você comprou: ");
        int macas = leitor.nextInt();

        boolean MaisDeDuzia = macas >= duzia;

        if (MaisDeDuzia) {
            float Valormaca = 1.30f;
            float Total = macas * Valormaca;
            System.out.printf("Você comprou %d Maças valendo %.2f R$ cada, pagará: %.2f", macas, Valormaca, Total);
        } else {
            float Valormaca = 1.50f;
            float Total = macas * Valormaca;
            System.out.printf("Você comprou %d Maças valendo %.2f R$ cada, pagará: %.2f", macas, Valormaca, Total);
        }
        
        leitor.close();
    }
    
}
