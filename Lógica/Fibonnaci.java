import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int PrimeiroNumero = 0; int SegundoNumero = 1; int Copia;

        System.out.print("Quantos números da sequencia de fibonnaci você quer saber: ");
        int Numeros = Leitor.nextInt();

        for (int x = 0; x != Numeros; x++) {
            if ( x == 0) {
                System.out.printf("%d, ", PrimeiroNumero);
            } else if (x == 1) {
                System.out.printf("%d, ", SegundoNumero);
            } else {
            Copia = SegundoNumero;
            SegundoNumero = PrimeiroNumero + SegundoNumero;
            PrimeiroNumero = Copia;
            System.out.printf("%d, ", SegundoNumero); }
        }
        Leitor.close();
    }    
}
