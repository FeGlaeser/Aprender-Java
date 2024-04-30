package EstruturaDeDados.Pilhas;

import java.util.Stack;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase para saber se é um palindromo: ");
        String frasePadrao = leitor.nextLine();
        String padraoFlat = frasePadrao.replace(" ", "");

        for (String letra : padraoFlat.split(""))
            pilha.add(letra);
        
        String fraseInversa = "";
        for (int x = 0; x != padraoFlat.length(); x ++) {
            fraseInversa += pilha.pop();}

        if (padraoFlat.equalsIgnoreCase(fraseInversa))
            System.out.print("é palindromo");
        
        else
            System.out.print("NÃO é palindromo.");

        leitor.close();
    }
    
}
