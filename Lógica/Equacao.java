import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o valor de X: ");
        int valorX = leitor.nextInt();
        double valorE = 1 + valorX;

        double valorFatorial = 1; double valorXelevado = valorX * valorX;

        for (int repete = 2; repete != 10; repete++) {
            for (int fatorialVezes = repete; fatorialVezes != 0; fatorialVezes --) {valorFatorial *= fatorialVezes;}

            valorE += valorXelevado / valorFatorial;
            valorFatorial = 1; valorXelevado *= valorX;}    
        
        System.out.printf("X sobre E é: %.5f", valorE);
        leitor.close();
    }
}