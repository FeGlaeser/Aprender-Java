import java.util.Scanner;

public class FuncionarioEmpresa {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        String Genero; String Matricula; String Concursado; int Idade; Float Altura; int Homens = 0;
        int FuncionariasConcursadas = 0; int MaiorIdadeConcursadoHomem = 0; int Concursados = 0;
        int MulheresMaisde30SemConcurso = 0; float MediaAlturaHomensMenos40 = 0f; int HomensMenos40 = 0;

        while (true) {
            System.out.print("Qual a sua matricula: ");
            Matricula = Leitor.next();
            if (Matricula.equals("0")) {
                break;}

            System.out.print("Quantos anos tem: ");
            Idade = Leitor.nextInt();

            while (true) {
                System.out.print("Ele é Homem (H) ou Mulher (M): ");
                Genero = Leitor.next();
                if (Genero.equalsIgnoreCase("H") || Genero.equalsIgnoreCase("M")) {
                    break;}
                System.out.println("Digite um valor Válido.");}

            System.out.print("Qual a sua Altura: ");
            Altura = Leitor.nextFloat();

            while (true) {
                System.out.print("é concursado [S/N]: ");
                Concursado = Leitor.next();
                if (Concursado.equalsIgnoreCase("N") || Concursado.equalsIgnoreCase("S")) {
                    break;}
                System.out.println("Digite um valor Válido.");}
            
            if (Genero.equalsIgnoreCase("H")) {
                Homens += 1;

                if (Concursado.equalsIgnoreCase("S")) {
                    Concursados += 1;

                    if (MaiorIdadeConcursadoHomem < Idade) {
                        MaiorIdadeConcursadoHomem = Idade;}}

                if (Idade < 40) {
                    HomensMenos40 += 1;
                    MediaAlturaHomensMenos40 += Altura;}

            } else {

                if (Concursado.equalsIgnoreCase("S")) {
                    FuncionariasConcursadas += 1;
                    Concursados += 1;

                } else {
                    if (Idade > 30) {
                        MulheresMaisde30SemConcurso += 1;}
                }
            }  
        }
        MediaAlturaHomensMenos40 /= HomensMenos40;

        System.out.printf("O número de Funcionárias Concursadas é: %d\n", FuncionariasConcursadas);
        System.out.printf("o número de funcionários (somente homens) É: %d\n", Homens);
        System.out.printf("a maior idade dos homens concursados é: %d\n", MaiorIdadeConcursadoHomem);
        System.out.printf("a quantidade de mulheres com mais de 30 anos sem concurso é: %d\n", 
        MulheresMaisde30SemConcurso);
        System.out.printf("a quantidade de concursados(as) é: %d\n", Concursados);
        System.out.printf("a média das alturas dos homens com menos de 40 anos é:\n",
        MediaAlturaHomensMenos40);

        Leitor.close();
    }
}