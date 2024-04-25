import java.util.Random;
import java.util.Scanner;

public class Cassino {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randola = new Random();
        int qntUm = 0, qntDois = 0, qntTres = 0, qntQuatro = 0, qntCinco = 0, qntSeis = 0;

        System.out.print("Quantos vezes rolaram o dado: ");
        int qntRoladas = leitor.nextInt();

        System.out.print("As rolagens feitas foram: ");
        int[] rolagens = new int[qntRoladas];
        for (int index = 0; index != qntRoladas; index ++) {
            rolagens[index] = randola.nextInt(6) + 1;
            if(index == qntRoladas - 1) {System.out.printf("%d.\n",rolagens[index]);}
            else {System.out.printf("%d, ",rolagens[index]);}
            switch (rolagens[index]) {
                case 1:
                    qntUm += 1;
                    break;
                case 2:
                    qntDois += 1;
                    break;
                case 3:
                    qntTres += 1;
                    break;
                case 4:
                    qntQuatro += 1;
                    break;
                case 5:
                    qntCinco += 1;
                    break;
                case 6:
                    qntSeis += 1;
                    break;}}

        System.out.println("O número 1 apareceu: "+ qntUm +" Vezes");
        System.out.println("O número 2 apareceu: "+ qntDois +" Vezes");
        System.out.println("O número 3 apareceu: "+ qntTres +" Vezes");
        System.out.println("O número 4 apareceu: "+ qntQuatro +" Vezes");
        System.out.println("O número 5 apareceu: "+ qntCinco +" Vezes");
        System.out.println("O número 6 apareceu: "+ qntSeis +" Vezes");


        leitor.close();
    }
}
