import java.util.Scanner;

public class ProcurarValor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        for (int c = 0; c != matriz.length; c ++) 
            for (int v = 0; v != matriz[c].length; v ++) {
                System.out.printf("Matriz [%d] x [%d]: ", c + 1, v + 1);
                matriz[c][v] = leitor.nextInt();}
        
        System.out.print("Informe um valor: ");
        int valor = leitor.nextInt();

        Boolean tem = false;
        for (int y = 0; y != matriz.length; y ++) {
            int soma = 0;
            for (int x = 0; x != matriz.length; x ++) {
                soma += matriz[y][x];}
            if (soma == valor) {
                System.out.print("Na linha " + y + 1 + " Tem");
                tem = true;}}
        if (!tem) System.out.print("Tem não po.");


        leitor.close();
    }
    
}
