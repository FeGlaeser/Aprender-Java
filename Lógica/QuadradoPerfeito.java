import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        while (true) {
            Boolean TemRaiz = false;
            System.out.println("\nDigite um número: (Menor ou igual a zero para Sair):");        
            int Numero = Leitor.nextInt();

            if (Numero <= 0) {
                break;}
            for (int x = 1; x != Numero + 1; x++) {
                if (Numero / x == x & Numero % x == 0) {
                    System.out.printf("Tem Raiz exata ela é o: %d", x);
                    TemRaiz = true;
                    break;}}
            if (!TemRaiz) {
            System.out.print("Ele não tem raiz quadrada exata");}}

        Leitor.close();
    }
}
