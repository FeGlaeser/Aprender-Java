import java.util.Scanner;

public class Letra{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra");
        String mensagem = leitor.next();

        char[][] letras = new char[mensagem.length()][1];

        for (int index = 0; index != mensagem.length(); index ++) {
            letras[index][0] = mensagem.charAt(index);}

        for (int index = 0; index != mensagem.length(); index ++) {
            System.out.print(letras[index][0]);}

        leitor.close();
    }
}