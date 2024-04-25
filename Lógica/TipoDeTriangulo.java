import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        int Valor1, Valor2, Valor3;
        String Mensagem;

        int[][] Listas = new int[5][3];
        Listas[0][0] = 1; Listas[0][1] = 2; Listas[0][2] = 3;
        Listas[1][0] = 3; Listas[1][1] = 4; Listas[1][2] = 5;
        Listas[2][0] = 2; Listas[2][1] = 2; Listas[2][2] = 4;
        Listas[3][0] = 4; Listas[3][1] = 4; Listas[3][2] = 4;
        Listas[4][0] = 5; Listas[4][1] = 3; Listas[4][2] = 3;

        for (int Repetir = 0; Repetir != Listas.length; Repetir++){
            Valor1 = Listas[Repetir][0]; 
            Valor2 = Listas[Repetir][1]; 
            Valor3 = Listas[Repetir][2];

            if (Valor1<Valor2+Valor3 & Valor2<Valor1+Valor3 & Valor3 < Valor1 + Valor2) {
                if (Valor1 == Valor2 & Valor2 == Valor3) {
                    Mensagem = "Triângulo Equilátero";
                } else {
                    if (Valor1 == Valor2 || Valor2 == Valor3 || Valor1== Valor3) {
                        Mensagem = "Triângulo Isósceles";
                    } else {
                        Mensagem = "Triângulo Escaleno";
                    }
                }
            } else {
                Mensagem = "Não é possivel montar um triangulo";
            }
            System.out.println(Mensagem);
    }
        Leitor.close();
    }   
}
