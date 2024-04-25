import java.util.Scanner;

public class ValorSacar {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Notas100; int Notas50; int Notas10; int Notas5; int Notas1;

        while (true) {
            System.out.print("Digite um valor pra Sacar: ");
            int Valor = Leitor.nextInt();

        if (Valor == 0) {
            break;}

        if (Valor / 100 >= 1){
        Notas100 = Valor / 100;
        System.out.printf("Notas de 100: %d\n", Notas100);
        Valor = Valor - Notas100 * 100;}
        if (Valor / 50 >= 1) {
            Notas50 = Valor / 50;
            System.out.printf("Notas de 50: %d\n", Notas50);
            Valor = Valor - Notas50 * 50;}
        if (Valor / 10 >= 1) {
            Notas10 = Valor / 10;
            System.out.printf("Notas de 10: %d\n", Notas10);
            Valor = Valor - Notas10 * 10;}
        if (Valor / 5 >= 1) {
            Notas5 = Valor / 5;
            System.out.printf("Notas de 5: %d\n", Notas5);
            Valor = Valor - Notas5 * 5;}
        if (Valor != 0) {
        Notas1 = Valor;
        System.out.printf("Notas de 1: %d\n", Notas1);}
        
        System.out.print("\n");}

        Leitor.close();
    } 
}
