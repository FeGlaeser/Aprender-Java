import java.util.Scanner;

public class Potencia {
    public static void main(String[] args ) {
        Scanner Leitor = new Scanner(System.in);
        String Mensagem;

        System.out.print("Digite um número: ");
        int Numero = Leitor.nextInt();

        System.out.print("Digite um expoente: ");
        int Expoente = Leitor.nextInt();

        if (Expoente == 0) {
            Mensagem = "Todo número elevado a zero é: 1";
        } else {
        Mensagem = Integer.toString(Numero);
        for (int x = 1; x != Expoente; x++) {
            Mensagem = Mensagem + " X " + Integer.toString(Numero);
        }
        int Soma = 1;
        while (Expoente != 0) {
            Expoente -= 1;
            Soma = Numero * Soma;
        }
        Mensagem = Mensagem + " = " + Integer.toString(Soma);
    }
        System.out.print(Mensagem);
        Leitor.close();
    }
}