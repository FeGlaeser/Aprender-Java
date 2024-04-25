import java.util.Scanner;

public class PrimoWhile {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        String Mensagem = "Esse número é primo";
        int Contador = 1;

        System.out.print("Digite um número primo");
        int Numero = Leitor.nextInt();

        while (Contador != Numero -1) {
            Contador += 1;
            if (Numero % Contador == 0) {
                Mensagem = "Esse número é Normal";
                break;
            }
        }
        
        System.out.print(Mensagem);
        Leitor.close();
    } 
}
