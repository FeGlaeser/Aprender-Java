package EstruturaDeDados.MapsHashMaps;

import java.util.HashMap;
import java.util.Scanner;


public class SenhaForte {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        HashMap<String, Integer> ocorrencias = new HashMap<>();
        boolean fraca = false;

        System.out.print("Digite sua senha: ");
        String senha = leitor.next();
        String[] caracteres = senha.split("");

        for (String letra : caracteres) {
            if (ocorrencias.containsKey(letra)) {
                ocorrencias.put(letra, ocorrencias.get(letra) + 1);
                fraca = true;}
            else
                ocorrencias.put(letra, 1);
        }

        if (!fraca)
            System.out.printf("[%s] é uma senha forte parabéns.", senha);
        else {
            for (HashMap.Entry<String, Integer> entrada : ocorrencias.entrySet()) {
                if (entrada.getValue() > 1) 
                    System.out.printf("O caracter %s apareceu: %d vezes.\n",
                    entrada.getKey(), entrada.getValue());
            }
            System.out.print("\nSua senha ainda é fraca.");}


        leitor.close();
    }
    
}
