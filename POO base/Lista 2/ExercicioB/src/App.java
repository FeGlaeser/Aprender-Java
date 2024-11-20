public class App {
    public static void main(String[] args) {
        Carro a = new Carro(); 
        Carro b = new Carro();

        b.marca = "Volkswagen";
        a.marca = "rolls roice";

        a.setAno(-4);

        System.out.print(a.toString());
    }
}
