import java.util.Scanner;

public class quadradu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String emcima = "", doslado = "";

        System.out.print("Quantas colunas no quadrado: ");
        int comprimento = leitor.nextInt();

        System.out.print("Quantas linhas de quadrado: ");
        int altura = leitor.nextInt();

        
        for (int x = comprimento; x != 0; x --) {if (x == comprimento) {emcima += " -";} else { emcima += "-";}}
        for (int y = comprimento + 2; y != 0; y --) {if (y - 2 == comprimento || y - 1 == 0) {doslado += "|";}
            else {doslado += " ";}}
        
        System.out.println(emcima);
        for (; altura != 0; altura --) {System.out.printf("%s\n",doslado);}
        System.out.println(emcima);

        leitor.close();
    }  
}
