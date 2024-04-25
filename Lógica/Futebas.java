import java.util.Scanner;

public class Futebas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o nome do primeiro time? ");
        String NomeTimeUm = leitor.next();
        System.out.printf("Quantos gols %s fez? ", NomeTimeUm);
        int Golsum = leitor.nextInt();

        System.out.print("Qual o nome do primeiro time? ");
        String NomeTimeDois = leitor.next();
        System.out.printf("Quantos gols %s fez? ", NomeTimeDois);
        int GolsDois = leitor.nextInt();

        if (Golsum == GolsDois) {
            System.out.printf("O time %s Empatou com o time %f [ %d X %d ]",NomeTimeDois, NomeTimeUm,
             Golsum, GolsDois);

        } else if  (Golsum > GolsDois) {
            System.out.printf("O Time %s Ganhou do time %s [ %d X %d ]", NomeTimeUm, NomeTimeDois,
             Golsum, GolsDois);
        } else {
            System.out.printf("O Time %s Ganhou do time %s [ %d X %d ]", NomeTimeDois, NomeTimeUm,
             GolsDois, Golsum);
        }

        leitor.close();
    }   
}
