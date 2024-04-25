import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float maiorSalarioM = 0, maiorSalarioF = 0, mediaF = 0, mediaM = 0;
        int homens = 0, mulheres = 0;

        System.out.print("Para quantos funcionários é a pesquisa: ");
        int quantia = leitor.nextInt();

        for (int pinto = quantia; pinto != 0; pinto --) {
            System.out.print("Qual o seu nome: ");
            String nome = leitor.next();

            System.out.printf("%s, qual seu genero [F/M]: ", nome);
            String genero = leitor.next();

            while (!genero.equalsIgnoreCase("F") && !genero.equalsIgnoreCase("M"))  {
            System.out.printf("%s, Por favor digite um genero válido: ", nome);
            genero = leitor.next();}

            System.out.printf("%s, quanto você ganha por mês: ", nome);
            float salario = leitor.nextFloat();

            if (genero.equalsIgnoreCase("f")) {
                mulheres += 1;
                mediaF += salario;
                if (maiorSalarioF < salario) {maiorSalarioF = salario;}}

            else {homens += 1; 
                mediaM += salario;
                if (maiorSalarioM < salario) {maiorSalarioM = salario;}}}
        
        mediaM /= homens;
        mediaF /= mulheres;   

        System.out.printf("A média salárial é: %.2f R$ para homens\n",mediaM);
        System.out.printf("A média salárial é: %.2f R$ para mulher\n",mediaF);
        System.out.printf("A melhor salário é: %.2f R$ para homens\n",maiorSalarioM);
        System.out.printf("A melhor salário é: %.2f R$ para mulheres\n",maiorSalarioF);


        leitor.close();
    }    
}
