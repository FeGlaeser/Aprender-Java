public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    // carro
    public void criarCarro(String marca, String modelo, int ano, double velocidadeInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidadeInicial;}

    // velocidade
    public void acelerarCarro(double qntAcelerada) {
        this.velocidade += qntAcelerada;}
    
    public void frearCarro(double qntFreada) {
        this.velocidade -= qntFreada;}
    
    public double getVelocidade() {
        return velocidade;}
    
    public void setVelocidade(double velocidadeNova) {
        this.velocidade = velocidadeNova;}
    
    // marca
    public void setMarca(String novaMarca) {
        this.marca = novaMarca.strip();}
    
    public String getMarca() {
        return marca;}
    
    // modelo
    public void setModelo(String novoModelo) {
        this.modelo = novoModelo.strip();}
    
    public String getModelo() {
        return modelo;}
    
    // ano
    public void setAno(int novoAno) {
        this.ano = novoAno;}
    
    public int getAno() {
        return ano;}
}
