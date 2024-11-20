import java.util.ArrayList;

public class Casa {
    ArrayList<Comodo> listaComodos;

    public Casa() {
        listaComodos = new ArrayList<>();
        listaComodos.add(new Comodo("Cozinha"));
        listaComodos.add(new Comodo("Quarto"));
        listaComodos.add(new Comodo("Banheiro"));
        listaComodos.add(new Comodo("Sala"));
    }

    public void destruirCasa() {
        for (Comodo comodo : listaComodos)
            listaComodos.remove(comodo);
    }
}
