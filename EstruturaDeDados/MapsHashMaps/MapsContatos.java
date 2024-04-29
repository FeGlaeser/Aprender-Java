package EstruturaDeDados.MapsHashMaps;

import java.util.Scanner;
import java.util.HashMap;

public class MapsContatos {
    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    HashMap<String, String> listaTelefones = new HashMap<>();
    limparTela();

    while (true) {
        System.out.print("Qual o nome do contato: ");
        String nome = leitor.next();

        if (nome.equals("Q")) break;
        leitor.nextLine();
    
        System.out.printf("Qual o número de %s: ", nome);
        String numero = leitor.nextLine();

        listaTelefones.put(nome, numero);

        limparTela();
        System.out.print("[Q] para sair.");}
    limparTela();

    while (true) {

        System.out.print("Qual nome da lista você quer conferir?");
        String contato = leitor.next();
        if (listaTelefones.containsKey(contato)) {
            System.out.print(listaTelefones.get(contato));}
        else 
            System.out.print("Contato não encontrado,");

        System.out.print(" aperte qualquer tecla para continuar ou [Q] para sair: ");
        contato = leitor.next();

        if (contato.equals("Q")) break;

        limparTela();}

    
    leitor.close();
    }
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}
