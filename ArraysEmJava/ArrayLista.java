package ArraysEmJava;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println("[Q] para quit.");
            System.out.printf("Qual o nome do convidado %d: ", idades.size()+1);
            String nome = leitor.next();
            if (nome.equalsIgnoreCase("q")) break;
    
            nomes.add(nome);
            System.out.printf("%s, quantos anos ele tem: ", nomes.get(nomes.size() - 1));
            idades.add(leitor.nextInt());
        }
    
        ArrayList<String> MaioresdeIdade = new ArrayList<>();
        
        int maisVelho = 0;
        for (int x = 0; x != idades.size(); x ++) {
            if (idades.get(x) > maisVelho) maisVelho = idades.get(x);
            if(idades.get(x) >= 18) MaioresdeIdade.add(nomes.get(x));}
        System.out.println("Os convidados maiores de idade são: "+ MaioresdeIdade);
        System.out.println("O mais velho da festa será o: " + nomes.get(idades.indexOf(maisVelho)));




        leitor.close();
    }
}
