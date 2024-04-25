import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float[] vetorNumeros = new float[10];

        System.out.println("Digite dez valores: ");

        for (int index = 0; index != 10; index ++)
        {System.out.printf("Número º%d: ",index + 1);
        vetorNumeros[index] = leitor.nextFloat();}

        for (int index = 0; index != 10; index ++) {
            if (vetorNumeros[index] % 2 == 0) 
                {System.out.printf("%.2f é Par. \n", vetorNumeros[index]);}}
        
        for (int index = 0; index != 10; index ++) {
            if (vetorNumeros[index] % 2 != 0) 
                {System.out.printf("%.2f é Impar. \n", vetorNumeros[index]);}}
        
        leitor.close();
    }
    
}
