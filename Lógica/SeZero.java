import java.util.Scanner;

public class SeZero {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        float ValorUm = Leitor.nextInt();

        System.out.print("Informe um valor: ");
        float ValorDois = Leitor.nextInt();

        while (ValorDois == 0) {
            System.out.print("Digite outro valor que não zero: ");
            ValorDois = Leitor.nextFloat();
        }

        Float ValorTotal = ValorUm / ValorDois ;
        System.out.printf("%.2f / %.2f = %.2f",ValorUm, ValorDois, ValorTotal);

        Leitor.close();
    }   
}
