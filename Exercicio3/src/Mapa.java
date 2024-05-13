public class Mapa {
    private int largura;
    private int comprimento;

    public void criarMapa(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public void mostrarMapa() {
        for (int x = 0; x != comprimento; x ++) {
            for (int y = 0; y != largura; y ++) {
                System.out.print("⬜");
            }
        System.out.println();
        }
    }
}
