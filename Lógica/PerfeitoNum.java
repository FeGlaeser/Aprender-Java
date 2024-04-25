import java.util.Scanner;

public class PerfeitoNum {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        
        for (int x = 1; x != 1001; x++) {
            for (int y = 1; y != x; y++) {
                if (x % y == 0) {soma += y;}}
            if (soma == x) {System.out.println(x);}
            soma = 0;
        }

        leitor.close();
    }
    
}
