import java.util.Scanner;

public class Inclusive {
    public static void main(String[] arg) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite um valor de 1 ao 10: ");
        int Valor = Leitor.nextInt();
        while (Valor > 10 || Valor < 1 ) {
            System.out.print("Digite um valor de 1 ao 10: ");
            Valor = Leitor.nextInt();
        }
        System.out.printf("Valor digitado foi: %d", Valor);
        Leitor.close();
    }
    
}
