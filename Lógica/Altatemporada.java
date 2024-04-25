import java.util.Scanner;

public class Altatemporada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite um número de um mês: ");
        int numeroMes = leitor.nextInt();

        if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12 || numeroMes == 6 || numeroMes == 7) {
            System.out.print("Alta temporada.");
        } else {System.out.print("Baixa temporada.");}

        leitor.close();
    }
    
}
