import java.util.Scanner;

public class Nadador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite a idade de um nadador: ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.print("Nadador Adulto");
        } else if (idade >= 14 & idade < 18) {
            System.out.print("Nadador Juvenil");
        } else if (idade >=9 & idade < 14) {
            System.out.print("Nadador Infantil");
        } else {
            System.out.print("Nadador Mirim");
        }
 
        leitor.close();
    } 
}
