import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    public static int numero = 0;
    private String nome;
    private LinkedList<HashMap<String, Float>> pedido;
    private String tempo;

    public Cliente(String nomeCliente, LinkedList<HashMap<String, Float>> pedido) {
        numero ++;
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm dd/MM");
        this.nome = nomeCliente;
        this.pedido = pedido;
        this.tempo = LocalDateTime.now().format(formatar);

    }
    public void infoCliente() {
        float total = 0;
        for (HashMap<String, Float> map : pedido) {
            for (Map.Entry<String, Float> entrada : map.entrySet()) {
                System.out.printf("%s:\t\t\t%.2f R$\n", entrada.getKey(), entrada.getValue());
                total += entrada.getValue();}}
        System.out.println();
        System.out.printf("Nome do cliente: %s\tTotal:\t%.2f R$\n", this.nome, total);
        System.out.printf("Número do pedido: %d\n", numero);
        System.out.printf("%s\n", this.tempo);


    }
}
 

