public class Mapa {
    private int[][] tamanho;

    public void criarMapa(int largura, int comprimento) {
        this.tamanho = new int[comprimento][largura];
    }

    public void mostrarMapa() {
        for (int x = 0; x != tamanho.length; x ++) {
            for (int y = 0; y != tamanho[0].length; y ++) {
                System.out.print("⬜");
            }
        System.out.println();
        }
    }
}
