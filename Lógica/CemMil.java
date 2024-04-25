import java.util.Scanner;

public class CemMil {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Contador = 0;
        for (int x = 100; x != 1000; x++) {
            int Num1 = x / 100; int Num2 = (x / 10) % 10; int Num3 = x % 10;
            int Total = Num1 * Num2 * Num3;
            
            System.out.printf("%d -> (%d*%d*%d) = %d \n", x, Num1, Num2, Num3, Total);

            Contador += 1;
            if (Contador == 20) {
                System.out.print("Aperte algo para continuar: ");
                Leitor.next();
                Contador = 0;}

        }

        Leitor.close();
    }
}
