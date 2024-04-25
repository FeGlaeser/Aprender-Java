import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] idades = new int[10];
        for (int x = 0; x != 10; x++) {
            System.out.printf("%d) Qual o idade: ",x + 1);
            idades[x] = leitor.nextInt();}
        for (int x = 0; x != 10; x ++) {
            if (idades[x] >= 18) {System.out.printf("%d) [%d anos]  Maior de idade \n", x + 1, idades[x]);}
            else {System.out.printf("%d) [%d anos] anos menor de idade \n", x + 1, idades[x]);}}

        leitor.close();
    }
}
