import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos anos tem o nadador: ");
        int idade = leitor.nextInt();


        if (idade > 60 || idade < 4)
        {System.out.printf("Esse nadador tem %d anos, e é impossivel classificar\n", idade);}

        else if (idade >= 18) 
        {System.out.printf("Esse nadador tem %d anos, e é classificado Adulto.\n", idade);}

        else if (idade >= 14) 
        {System.out.printf("Esse nadador tem %d anos, e é classificado Juvenil.\n", idade);}

        else if (idade >= 9) 
        {System.out.printf("Esse nadador tem %d anos, e é classificado Infantil.\n", idade);}

        else if (idade < 9)
        {System.out.printf("Esse nadador tem %d anos, e é classificado Mirim.\n", idade);}

        leitor.close();
    }
    
}
