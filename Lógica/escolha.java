import java.util.Scanner;

public interface escolha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final String codigoVerdadeiro = "1234";
        final String senha = "9999";
        String CodigoTentiva, SenhaTentativa;
        
        System.out.print("Digite o código: ");
        CodigoTentiva = leitor.next();

        if (CodigoTentiva.equals(codigoVerdadeiro)) {
            System.out.print("Digite a Senha: ");
            SenhaTentativa = leitor.next();

            if (senha.equals(SenhaTentativa)) {
                System.out.print("Acesso concedido.");
            } else {
                System.out.print("Acesso negado (Senha incorreta).");
            }
        } else {
            System.out.print("Acesso negado (Código incorreto).");
        }

        leitor.close();
    }
}
