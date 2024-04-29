package EstruturaDeDados.MapsHashMaps;

import java.util.Scanner;
import java.util.HashMap;

public class Repeticoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        HashMap<String, Integer> quantias = new HashMap<>();

        System.out.print("Digite uma frase: ");
        String[] frase = leitor.nextLine().toLowerCase().split(" ");

        for (String palavra: frase) {
            if (quantias.containsKey(palavra))
                quantias.put(palavra, quantias.get(palavra) + 1);
            else
                quantias.put(palavra, 1);}
        
        for (HashMap.Entry<String, Integer> entry : quantias.entrySet()) {
            System.out.printf("A Palavra [%s] apareu: %d vezes.\n", entry.getKey(), entry.getValue());
        }
    
        leitor.close();
    }
    
}
