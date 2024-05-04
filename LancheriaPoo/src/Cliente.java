import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.time.LocalDate;

public class Cliente {
    private int numero = 0;
    private String nome;
    private LinkedList<HashMap<String, Float>> pedido;
    private LocalDate tempo;

    public Cliente(String nomeCliente, LinkedList<HashMap<String, Float>> pedido) {
        this.numero ++;
        this.nome = nomeCliente;
        this.pedido = pedido;
        this.tempo = LocalDate.now();
    }
    public void infoCliente() {
        float total = 0;
        for (HashMap<String, Float> map : pedido) {
            for (Map.Entry<String, Float> entrada : map.entrySet()) {
                System.out.printf("%s:\t\t%.2f R$\n", entrada.getKey(), entrada.getValue());
                total += entrada.getValue();}}
        System.out.printf("Nome do cliente: %s\tTotal:\t\t%.2f R$\n", this.nome, total);
        System.out.printf("Data %s\tNúmero pedido %d\n", this.tempo, this.numero);
    }
}
 

