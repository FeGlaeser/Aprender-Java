public class Carro {
    String modelo;
    String cor;
    int ano;
    
    Carro(String modelo, String cor, int ano) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    void exibirDetalhes() {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(ano);
    }


}
