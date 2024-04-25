import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Numero; String Continuar;

        while (true) {

            while (true) {
                System.out.print("Informe um número Inteiro e Positivo: ");
                Numero = Leitor.nextInt();

                if (Numero > 0) {
                    break;}
                else {System.out.println("Informe um valor válido.");}}

            for (int x = 1; x != Numero + 1; x++) {
                if (x % 2 == 0) {System.out.printf("%d ", x);}}
        
            System.out.print("\nDeseja continuar: [S/N]");
            Continuar = Leitor.next();
    
            if (Continuar.equalsIgnoreCase("N")) {
                break;}}

        Leitor.close();
    }
}
