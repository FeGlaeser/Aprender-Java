import java.util.Scanner;


public class NotasABCD {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        final float NotaA = 9.0f;
        final float NotaB = 7.5f;
        final float NotaC = 6.0f;

        Float NotaUm, NotaDois, NotaTres, Media;

        System.out.print("Qual sua Primeira nota? ");
        NotaUm = Leitor.nextFloat();

        System.out.print("Qual sua Segunda nota? ");
        NotaDois = Leitor.nextFloat();

        System.out.print("Qual sua primeira nota? ");
        NotaTres = Leitor.nextFloat();

        Media = (NotaUm + NotaDois + NotaTres) / 3;

        System.out.printf("Media = %.1f\n", Media);
        if (Media >= NotaA) {
            System.out.print("Você tirou nota: A");
        } else if (Media >= NotaB) {
            System.out.print("Você tirou nota: B");
        } else if (Media >= NotaC) {
            System.out.print("Você tirou nota: C");
        } else {
            System.out.print("Você tirou nota: D");
        }

        Leitor.close();
    } 
}
