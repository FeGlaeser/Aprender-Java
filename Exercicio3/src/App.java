import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        limparTela();
        Mapa salaBranca = new Mapa();
        salaBranca.criarMapa(5, 5);
        salaBranca.mostrarMapa();


        leitor.close();
    }
    public static void limparTela() {
        System.out.println("\033[H\033[J");
        System.out.flush();
    }
    
}
