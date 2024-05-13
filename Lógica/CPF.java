import java.util.Scanner;

public class CPF {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int index, soma;
        String cpfBruto;

        while (true) {  
        System.out.print("Digite o seu CPF (Com ou sem pontos e traço): ");
        cpfBruto = leitor.next();

        if (cpfBruto.length() == 11) {
            if (vericar_numero(cpfBruto)) break;

            else {
                limparConsole();
                System.out.println("Digite apenas valores númericos.");}}

        else if (cpfBruto.length() == 14) {
            boolean pontoEtraco = cpfBruto.charAt(3) == '.' 
            && cpfBruto.charAt(7) == '.' && cpfBruto.charAt(11) == '-';

            if (pontoEtraco) {
                cpfBruto = cpfBruto.substring(0, 3)
                + cpfBruto.substring(4, 7) + cpfBruto.substring(8, 11)
                + cpfBruto.substring(12, 14);
                if (vericar_numero(cpfBruto)) break;

                else {limparConsole();
                    System.out.println("Digite apenas valores númericos.");}}
    
            else {
                limparConsole();
                System.out.println("Coloque os pontos nos lugares válidos.");}

        } else {
            limparConsole();
            System.out.println("(11 algarismo númericos) ou (14 algarismos com os pontos e traço)");}}

        String supostosVerificadores = cpfBruto.substring(9, 11);
        cpfBruto = cpfBruto.substring(0, 9);

        for (int y = 2; y != 0; y--) {
        index = 0; soma = 0;

        for (int x = cpfBruto.length() + 1; x != 1; x --) {
            
            soma = soma + Integer.parseInt(String.valueOf(cpfBruto.charAt(index))) * x;
            index += 1;}

            soma = soma % 11;
            soma = 11 - soma;

            if (soma >= 10) {cpfBruto += "0";}
            else {cpfBruto += String.valueOf(soma);}}
        
        if (supostosVerificadores.equals(cpfBruto.substring(9, 11))) {
            System.out.print("O Cpf digitado existe.");}
        else {
            String cpfFalso = cpfBruto.substring(0, 9) + supostosVerificadores;
            System.out.printf("O cpf: %s é falso o Certo é: %s", cpfFalso, cpfBruto);}

        leitor.close();
    }

    public static boolean vericar_numero(String CpfString) {
        try {
            Double.parseDouble(CpfString);
            return true;}
        
        catch (NumberFormatException e) {
            return false;}}
    
    public static void limparConsole() {
        try {new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();}
        catch (final Exception e) {System.out.print("Erro ao limpar o cache");}
    }
}
