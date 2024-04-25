import java.util.Scanner;


public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        String[][] jogo = new String[][] {{"_","_","_"},{"_","_","_"},{"_","_","_"}};

        String jogador = null;
        for (int jogadas = 1; jogadas != 10; jogadas ++) {
            jogador = "X";
            if (jogadas % 2 == 0) jogador = "O";

            mostraJogo(jogo);

            jogo = jogada(jogo, jogador, leitor);

            if (jogadas > 4)
                if (ganhou(jogo, jogador))
                    break;
        }
        finalizar(jogo, jogador);
        leitor.close();

    }

    public static void mostraJogo(String[][] jogo) {
        limparTela();

        for (int x = 0; x != jogo.length; x ++)
            for (int y = 0; y != jogo[0].length; y ++) {
                System.out.printf("%s   ", jogo[x][y]);
                if (y == jogo[0].length - 1) System.out.print("\n\n");}
        System.out.println();
    }

    public static String[][] jogada(String[][] jogo, String jogador, Scanner leitor) {
        int coluna, linha;
        while (true) {
            System.out.printf("Qual posição para %s? ", jogador);
            int posicao = leitor.nextInt();

            coluna = (posicao - 1) % jogo[0].length;
            linha =  (posicao - 1) / jogo[0].length; 
            
            if (jogo[linha][coluna].equals("_")) break;}

        jogo[linha][coluna] = jogador;
        return jogo;
    }

    public static boolean ganhou(String[][] jogo, String jogador) {
        int pontosVertical = 0, pontosHorizontal = 0, pontosDiagonalE = 0, pontosDiagonalD = 0;
        for (int x = 0; x != jogo.length; x ++) {
            if (jogo[x][x].equals(jogador))
                pontosDiagonalE ++;

            if (jogo[x][jogo[x].length - 1 - x].equals(jogador))
                pontosDiagonalD ++;

            for (int y = 0; y != jogo[0].length; y ++) {
                if (jogo[x][y].equals(jogador))
                    pontosHorizontal ++;

                if (jogo[y][x].equals(jogador))
                    pontosVertical ++;}

            if (pontosHorizontal == 3 || pontosVertical == 3) 
                return true;
            pontosHorizontal = 0; pontosVertical = 0;}
        if (pontosDiagonalD == 3|| pontosDiagonalE == 3)
            return true;
        return false;
    }

    public static void finalizar(String[][] jogo, String jogador) {
        limparTela();

        mostraJogo(jogo);

        if (ganhou(jogo, jogador))
            System.out.printf("%s ganhou, acabou o jogo!!", jogador);
        else
            System.out.print("Deu velha!!");
    }
    
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
        System.out.println();
    }
}