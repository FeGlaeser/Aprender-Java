import java.util.Scanner;

public class FiveNotas {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Notas = 1;
        Float Media = 0f;

        while (Notas != 6) {
            System.out.printf("Quanto você tirou na prova %dº: ", Notas);
            Media += Leitor.nextFloat();
            Notas += 1; 
        }
        Media = Media / Notas;
        System.out.printf("Após as 5 provas você tem: %.1f de média", Media);

        Leitor.close();
    }
    
}
