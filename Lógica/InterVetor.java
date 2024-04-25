import java.util.Scanner;

public class InterVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] conjuntoA = new int[5];
        int[] conjuntoB = new int[5];

        for (int a = 0; a != 5; a++) {
            System.out.printf("%d) da lista 1 valor: ", a + 1);
            conjuntoA[a] = leitor.nextInt();}

        for (int b = 0; b != 5; b++) {
            System.out.printf("%d) da lista 2 valor: ", b + 1);
            conjuntoB[b] = leitor.nextInt();}

        int[] conjuntoC = new int[conjuntoA.length + conjuntoB.length];
        int indexA = 0; int indexB = 0;

        for (int c = 0; c != conjuntoC.length; c++) {

            if (indexA != 5 && indexB != 5) {
                if (conjuntoA[indexA] < conjuntoB[indexB]) {
                    conjuntoC[c] = conjuntoA[indexA];
                    indexA += 1;}

                else {conjuntoC[c] = conjuntoB[indexB];
                    indexB += 1;}}

            else if (indexA == 5) {
                conjuntoC[c] = conjuntoB[indexB];
                indexB += 1;}
            
            else if (indexB == 5) {
                conjuntoC[c] = conjuntoA[indexA];
                indexA += 1;}}


        for (int c = 0; c != conjuntoC.length; c++) {
            if (c == conjuntoC.length - 1) {
                System.out.printf("%d.", conjuntoC[c]);
                break;}

            System.out.printf("%d, ", conjuntoC[c]);
        }
        
        leitor.close();
    }
    
}
