public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return 3.14 * (raio * raio);
    }

    double calcularPerimetro() {
        return 3.14 * raio * 2;
    }
}
 