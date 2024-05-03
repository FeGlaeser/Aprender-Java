public class Celular {
    private String marca;
    private float versao;
    private int memoria;
    private boolean ligado;
    
    public Celular(String marca, float versao, int memoria, boolean ligado) {
        this.marca = marca;
        this.versao = versao;
        this.memoria = memoria;
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = !ligado;}
    
    public void info() {
        System.out.printf("Marca: %S Versão: %.2f\n", this.marca, this.versao);
        System.out.printf("Memoria: %d Ligado: %B", this.memoria, this.ligado);
    }

    public void atualizar(float versaoNova) {
        this.versao = versaoNova;
    }
}
