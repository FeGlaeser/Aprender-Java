import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean tem;

        int[] valores = new int[20];

        System.out.println("Digite os vinte valores da array: ");
        for (int i = 0; i != 20; i++) {
            System.out.printf("%d) Valor: ", i + 1);
            valores[i] = leitor.nextInt();}

        while (true) {
            limparMensagens();
            tem = false;

            for (int index = 0; index != valores.length; index ++) {
                if (index == 9) {System.out.printf("[%d] \n",valores[index]);
                    continue;}
                System.out.printf("[%d] ",valores[index]);}

            System.out.print("\nQual número você quer procurar na lista: ");
            int procurar = leitor.nextInt();

            for (int index = 0; index != valores.length; index ++) {
                if (valores[index] == procurar) {
                    System.out.printf("O valor [%d] existe e está na %dº posição.\n", valores[index], index +1);
                    tem = true;
                    break;}}
            
            if (!tem) {System.out.println("Não achei na busca");}
            System.out.print("Qualquer tecla continua [(S)air]: ");
            String tecla = leitor.next();
            if (tecla.equalsIgnoreCase("S")) {break;}}
    leitor.close();
    }
    public static void limparMensagens() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
