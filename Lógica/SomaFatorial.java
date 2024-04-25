import java.util.Scanner;

public class SomaFatorial {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Fatorais = 1; Double SomaTotal = 0.0;

        System.out.print("Quantos valores Você quer ver: ");
        int Quantia = Leitor.nextInt();

        for (int x = 1; x != Quantia + 1; x++) {
            Double SomaFatorial = (double) Fatorais;

            for (int y = Fatorais - 1; y != 0; y--) {
                SomaFatorial = SomaFatorial * y;}

            SomaTotal = SomaTotal + (x / SomaFatorial);

            if (x == Quantia) {
                System.out.printf("%d/%d! = %f",x , Fatorais, SomaTotal );}
            else {
            System.out.printf("%d/%d! + ",x , Fatorais);}

            Fatorais += 2;
        }
        Leitor.close();
    } 
}
