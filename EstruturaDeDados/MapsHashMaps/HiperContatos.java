package EstruturaDeDados.MapsHashMaps;

import java.util.Scanner;
import java.util.HashMap;

public class HiperContatos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        HashMap<String, String> contatos = new HashMap<>();

        limparTela();
        while (true) {
            System.out.println("[1] Adicionar Contatos");
            System.out.println("[2] Remover Contatos");
            System.out.println("[3] Mostrar contatos");
            System.out.println("[4] Sair");
            int lobby;
            while (true) {
                lobby = leitor.nextInt();
                if (lobby >= 1 && lobby <= 4)
                    break;
                System.out.print("Selecione uma opção válida. ");}
            limparTela();

            if (lobby == 4)
                break;
            if (lobby == 3) {
                mostrarDicionario(contatos);
                System.out.print("Aperte qualquer tecla para continuar: ");
                leitor.next();}
            if (lobby == 2) {
                mostrarDicionario(contatos);
                if (contatos.isEmpty()) {
                    System.out.print("Aperte qualquer tecla para continuar: ");
                    leitor.next();}
                else {
                    System.out.print("Diga o nome do contato para apagar: ");
                    String remover = leitor.next();

                    if (contatos.containsKey(remover))
                        contatos.remove(remover);

                    else {
                        System.out.print("Esse contato não está na lista, aperte qualquer tecla: ");
                        leitor.next();}}}

            if (lobby == 1) {
                leitor.nextLine();

                System.out.print("Qual contato será adicionado: ");
                String nome = leitor.nextLine();

                System.out.print("Qual o número desse contato: ");
                String numero = leitor.nextLine();

                contatos.put(nome, numero);}

            limparTela();}


        leitor.close();
    }
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
    public static void mostrarDicionario (HashMap<String, String> Contatos) {
        if(Contatos.isEmpty())
            System.out.println("Nenhum Contato na lista.");
        else
            for (HashMap.Entry<String, String> entrada : Contatos.entrySet()) {
                System.out.println(entrada.getKey());
                System.out.printf("└--- %s \n\n", entrada.getValue());}
    }
}
