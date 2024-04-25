import java.util.Scanner;

public class Mercadorias {
    public static void main(String[] guaxinim) {
        Scanner Leitor = new Scanner(System.in);
        Float Media; Float Soma = 0f;

        System.out.print("Quantas mercadorias tem em estoque? ");
        int QntsMercadorias = Leitor.nextInt();

        for (int c = 0; c != QntsMercadorias; c++) {
            System.out.printf("Qual o valor da %dº: ", c + 1);
            Soma += Leitor.nextFloat();
        }
        Media = Soma / QntsMercadorias;
        System.out.printf("Dos %d produtos a média é %.2f R$\nA soma é %.2f R$\n", QntsMercadorias, Media, Soma);

        Leitor.close();
    } 
}
