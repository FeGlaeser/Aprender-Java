import java.util.Scanner;

public class SomaTodosPares {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Soma = 0;

        System.out.print("Digite um valor: ");
        int Valor = Leitor.nextInt();

        for (int c = 0; c != Valor + 1; c ++) {
            if (c % 2 == 0){
                Soma += c;
            }
        }
        System.out.printf("A soma de todos valores pares de %d é %d", Valor, Soma);
        Leitor.close();
    } 
    
}
