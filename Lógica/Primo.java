import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        String Mensagem = "É primo";

        System.out.print("Digite um número inteiro e possitivo: ");
        int Valor = Leitor.nextInt();

        if (Valor == 2 || Valor == 1) {
            Mensagem = "Tanto o 2 quanto o 1 não são primos";
        } else {
        for (int x = Valor - 1; x != 1; x --) {
            if (Valor % 2 == 0) {
                Mensagem = "Não é primo";
            }
        }
    }
        System.out.print(Mensagem);
        Leitor.close();
    } 
}
