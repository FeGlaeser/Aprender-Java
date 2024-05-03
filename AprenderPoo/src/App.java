
public class App {
    public static void main(String[] args) throws Exception {
        
     Celular cel1 = new Celular("Sansung", 2.3f, 500, true);

    cel1.atualizar(3.67f);
    cel1.ligar();

     cel1.info();
    }
}
