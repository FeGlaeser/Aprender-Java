import java.util.Scanner;

public class AdicaoEstranha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = leitor.nextInt();
        
        int resultado = numero1 + numero2;
        Boolean Maior20 = resultado > 20;

        if (Maior20) {
            int resultado8 = resultado + 8;
            System.out.printf("%d + %d = %d + 8 = %d\n", numero1, numero2, resultado, resultado8 );
        } else {
            int resultado10 = resultado - 10;
            System.out.printf("%d + %d = %d -10 = %d\n", numero1, numero2, resultado, resultado10);
        }
        leitor.close();
        
    }
}
