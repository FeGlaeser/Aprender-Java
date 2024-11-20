public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea() {
        return largura * altura;
    }

    Retangulo compararArea(Retangulo segundo) {

        if (this.calcularArea() > segundo.calcularArea())
            return this;
        return segundo;
    }
}
