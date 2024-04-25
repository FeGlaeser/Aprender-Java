import java.util.Scanner;


public class Crescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor 1: ");
        int valorum = leitor.nextInt();

        System.out.print("Insira o valor 2: ");
        int valordois = leitor.nextInt();

        System.out.print("Insira o valor 1:  ");
        int valortres = leitor.nextInt();

        if (valorum > valordois & valorum > valortres) {
            if (valordois > valortres) {
                System.out.printf("Valor 1 (%d) > Valor 2 (%d) > Valor 3 (%d)", valorum, valordois, valortres);
            } else {
                System.out.printf("Valor 1 (%d) > Valor 3 (%d) > Valor 2 (%d)", valorum, valortres, valordois);
            }
        } else if (valordois > valorum & valordois > valortres) {
            if (valortres > valorum) {
                System.out.printf("Valor 2 (%d) > Valor 3 (%d) > Valor 1 (%d)", valordois, valortres, valorum);
            } else {
            System.out.printf("Valor 2 (%d) > Valor 1 (%d) > Valor 2 (%d)", valordois, valorum, valortres);
            }
        } else {
            if (valordois > valorum) { 
                System.out.printf("Valor 3 (%d) > Valor 1 (%d) > Valor 2 (%d)", valortres, valorum, valordois);
            } else {
                System.out.printf("Valor 3 (%d) > Valor 2 (%d) > Valor 1 (%d)", valortres, valordois, valorum);
            }
        }
        leitor.close();
    }
}
