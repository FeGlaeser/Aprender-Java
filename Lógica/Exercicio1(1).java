import java.util.Scanner;

class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número Inteiro: ");
        int numero = leitor.nextInt();

        int antecessor = numero - 1;
        System.out.printf("O antecessor de %d é %d", numero, antecessor);

        leitor.close();

    }
}