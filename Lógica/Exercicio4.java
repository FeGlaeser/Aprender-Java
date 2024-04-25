import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

        System.out.print("Qual o valor a ser sacado: ");
        int valor = leitor.nextInt();


        int notasCem = valor / 100;
        valor -= notasCem * 100;
        if (notasCem != 0) {System.out.printf("Notas de 100: %d\n", notasCem);}

        int notasCinquenta = valor / 50;
        valor -= notasCinquenta * 50;
        if (notasCinquenta != 0) {System.out.printf("Notas de 50: %d\n", notasCinquenta);}

        int notasVinte = valor / 20;
        valor -= notasVinte * 20;
        if (notasVinte != 0) {System.out.printf("Notas de 20: %d\n", notasVinte);}

        int notasDez = valor / 10;
        valor -= notasDez * 10;
        if (notasDez != 0) {System.out.printf("Notas de 10: %d\n", notasDez);}

        int notasCinco = valor / 5;
        valor -= notasCinco * 5;
        if (notasCinco != 0) {System.out.printf("Notas de 5: %d\n", notasCinco);}

        if (valor % 2 != 0) {valor += 1;}
        
        int notasDois = valor / 2;
        valor -= notasDois * 2;
        if (notasDois != 0) {System.out.printf("Notas de 2: %d\n", notasDois);}

        leitor.close();
    }
    
}
