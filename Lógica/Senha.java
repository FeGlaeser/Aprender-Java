import java.util.Scanner;

public class Senha {
    public static void main(String[] arg) {
        Scanner Leitor = new Scanner(System.in);
        String SenhaReal = "123456";
        int Tentativas = 0;

        while (true) {
            System.out.print("Qual a senha: ");
            String Senha = Leitor.next();
            Tentativas += 1;
            if (Senha.equals(SenhaReal)) {
                break;
            }
            System.out.print("Senha errada\n");
        }
        System.out.printf("O número de tentativas foram: %d", Tentativas);
        Leitor.close();
    }
}