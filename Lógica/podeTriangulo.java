import java.util.Scanner;

public class podeTriangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor ");
        int valorum = leitor.nextInt();

        System.out.print("Digite o primeiro valor ");
        int valordois = leitor.nextInt();

        System.out.print("Digite o primeiro valor ");
        int valortres = leitor.nextInt();

        Boolean Valorcheck = (valortres > valordois + valorum) & (valordois > valortres + valorum)
         & (valorum > valortres + valordois);
         if (Valorcheck) {
            System.out.print("Pode sim ser um triangulo ");
         } else {
            System.out.print("não pode ser um triangulo ");
         }
        
        leitor.close();
    }
}
