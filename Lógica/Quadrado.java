import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        String QuadradoLargura = "";
        int Comprimento; int Area;

        System.out.print("Quanto vale um lado do Quadrado: ");
        Comprimento = Leitor.nextInt();

        while (Comprimento < 1 || Comprimento > 20) {
            System.out.print("Insira um valor entre 1 e 20: ");
            Comprimento = Leitor.nextInt();
        }
        
        Area = Comprimento * Comprimento;

        for (int Linhas = 0; Linhas != Comprimento; Linhas ++) {
        for (int Asterisco = 0; Asterisco != Comprimento; Asterisco++ ) {
            QuadradoLargura += "*  "; }
            QuadradoLargura += "\n";}

    System.out.printf("\nA area do Quadrado é (%d X %d = %d) \n", Comprimento, Comprimento, Area);
    System.out.println("A representação do Quadrado é:");
    System.out.print(QuadradoLargura);

    Leitor.close();
    }
}