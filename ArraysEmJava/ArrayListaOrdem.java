package ArraysEmJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListaOrdem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<String> generos = new ArrayList<>();

        limparTela();
        
        while (true) {
            System.out.printf("Qual o nome da pessoa %d: ", nomes.size() + 1);
            String nome = leitor.next();

            if (nome.equalsIgnoreCase("Q")) {
                limparTela();
                break;}

            nomes.add(nome);

            System.out.printf("Quantos anos tem %s: ",nomes.getLast());
            idades.add(leitor.nextInt());

            while (true) {
                System.out.printf("Qual o genero de %s [M]asculino ou [F]eminino: ", nomes.getLast());
                char genero = leitor.next().toUpperCase().charAt(0);
                if (genero == 77 || genero == 70) {
                    generos.add(Character.toString(genero));
                    break;}
                System.out.print("Adicione um valor válido. ");}
            
            limparTela();
            System.out.println("[Q]uit");
        }
        int maisVelho = 0; boolean jafoi = false;
        int maisNova = 0;
        for (int x = 0; x != nomes.size(); x ++) {
            if (!jafoi && generos.get(x).equals("F")) {
                jafoi = true;
                maisNova = idades.get(x);}
            else if (maisNova > idades.get(x) && generos.get(x).equals("F"))
                maisNova = idades.get(x);
            if (x == 0) {maisVelho = idades.get(x);}
            
            System.out.println("Nome: " + nomes.get(x));
            System.out.println("Idade: " + idades.get(x));
            System.out.printf("Genero: %s\n\n", generos.get(x));}


        System.out.printf("O nome do homem mais velho é: %s\n", nomes.get(idades.lastIndexOf(maisVelho)));
        System.out.println("O nome da mulher mais nova é: "+ maisNova);

        leitor.close();


    } 
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}
