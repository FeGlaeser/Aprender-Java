public class Carro {
    public String marca;
    protected String modelo;
    private int ano;


    Carro() {

    }
    
    void setAno(int ano) {
        if (ano >= 1886) this.ano = ano;
    }

    int getAno() {
        return this.ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
            "marca='" + this.marca + '\'' +
            ", modelo=" + this.modelo +
            ", ano=" + this.ano +
            '}';
    }
}