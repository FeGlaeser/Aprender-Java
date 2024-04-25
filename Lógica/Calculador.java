import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float total = 0; boolean erro = false;
        String numeroUmString, numeroDoisString;
        float numeroUm, numeroDois;

        do {
        System.out.print("Digite o primeiro número: ");
        numeroUmString = leitor.next();
        } while (verificar_numero(numeroUmString));
        numeroUm = Float.parseFloat(numeroUmString);

        do {
        System.out.print("Digite o segundo número: ");
        numeroDoisString = leitor.next();
        } while (verificar_numero(numeroDoisString));
        numeroDois = Float.parseFloat(numeroDoisString);


        System.out.println("Operadores (X, %, +, -)");
        System.out.print("Selecione um operador:");
        char operador = leitor.next().charAt(0);

        do {
            switch (operador) {
                case 'X':
                    total = numeroDois * numeroUm;
                    break;
                case '%':
                    total = numeroUm / numeroDois;
                        break;
                case '+':
                    total = numeroDois + numeroUm;
                    break;
                case '-':
                    total = numeroUm - numeroDois;
                    break;
                default:
                    erro = true;}
        } while (erro);
            
            
        System.out.printf("Total: %.2f", total);
        leitor.close();
    }

    public static boolean verificar_numero(String supostoNumero) {
        try {Float.parseFloat(supostoNumero);
            return false;}

        catch (NumberFormatException e) {
            return true;}
    }
}
