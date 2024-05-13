public class App {
    public static void main(String[] args) {
        limparTela();
        Personagem jogador = new Personagem();
        jogador.criarPersonagem();

        Mapa salaBranca = new Mapa();
        salaBranca.criarMapa(5, 5);
        salaBranca.mostrarMapa();


    }
    public static void limparTela() {
        System.out.println("\033[H\033[J");
        System.out.flush();
    }
    
}
