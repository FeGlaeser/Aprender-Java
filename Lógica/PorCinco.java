import java.util.Scanner;

public class PorCinco {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int Valor = Leitor.nextInt();

        while (Valor % 5 != 0) {
            System.out.print("Digite um outro valor; ");
            Valor = Leitor.nextInt();
        }
        
        System.out.printf("O valor digitado foi: %d", Valor);
        Leitor.close();
    } 
}
