import java.util.Scanner;

public class ValorE {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leitor = new Scanner(System.in);
        double valorFatorial = 1; double valorE = 1;

        System.out.print("Quantos valores de N você deseja: ");
        int valorN = leitor.nextInt();

        for (; valorN != 0; valorN --) {for (int x = 1; x != valorN + 1; x ++) {valorFatorial *= x;}
            valorE +=  1 / valorFatorial;
            valorFatorial = 1;}
        
        System.out.printf("Seu número é %f", valorE);
        
        leitor.close();
    } 
}
