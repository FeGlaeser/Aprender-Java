import java.util.Scanner;

public class TresNotas {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        Float ValorUm; Float ValorDois; Float ValorTres; Float Media;

        System.out.print("Digite sua 1º Nota: ");
        ValorUm = Leitor.nextFloat();

        System.out.print("Digite sua 2º Nota: ");
        ValorDois = Leitor.nextFloat();

        System.out.print("Digite sua 3º Nota: ");
        ValorTres = Leitor.nextFloat();
        
        if (ValorUm > ValorDois & ValorUm > ValorTres) {
            if (ValorTres > ValorDois) {
                Media = (ValorUm + ValorTres) / 2;
            } else {
                Media = (ValorUm + ValorDois) / 2;}
            } else if (ValorDois > ValorTres & ValorDois > ValorUm) {
                if (ValorTres > ValorUm) {
                    Media = (ValorDois + ValorTres) / 2;
                } else {
                    Media = (ValorDois + ValorUm) / 2;
                }
            } else {
                if (ValorDois > ValorUm) {
                    Media = (ValorDois + ValorTres) / 2;
                } else {
                    Media = (ValorTres + ValorUm) / 2;
                }
            }
        System.out.printf("Sua média é: %.2f",Media);
        Leitor.close();
    }
}