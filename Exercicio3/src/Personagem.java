import java.util.Scanner;

public class Personagem {
    private String nomeDoPersonagem;
    private String generoDoPersonagem;
    private String emoji;
    
    public void criarPersonagem() {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Qual o seu nome:");
            this.nomeDoPersonagem = leitor.next();

            while (true) {
                System.out.println("Você é do genero [F]eminino ou [M]asculino:");
                Character genero = leitor.next().charAt(0);

                if (genero == 'm' || genero == 'M') {
                    this.generoDoPersonagem = "Masculino";
                    break;}
                else if (genero == 'f' || genero == 'F') {
                    this.generoDoPersonagem = "Feminino";
                    break;}
                
                limparTela();
                System.out.println("Digite um Genero válido");
            }
    
            char lobby;
            System.out.printf("Seu nome é %s e você é do genero %S\n",
            this.nomeDoPersonagem, this.generoDoPersonagem);

            while (true) {
                System.out.print("Está certo isso: [N]ão [S]im ");
                lobby = leitor.next().charAt(0);

                if (lobby == 'n' || lobby == 'N')
                    break;
                if (lobby == 's' || lobby == 'S')
                    break;
                
                System.out.println("insira uma opção válida.");}
            
            if (lobby == 's' || lobby == 'S')
                break;
            limparTela();}

        System.out.printf("%s hora de escolher seu icone: \n", this.nomeDoPersonagem);

        if (generoDoPersonagem.equals("Feminino")) {
            System.out.println("[1] 🧙🏼‍♀️ Bruxa");
            System.out.println("[2] 🧛🏼‍♀️ Vampira");
            System.out.println("[3] 🕵🏼‍♀️ Detetive");}
        else {
            System.out.println("[1] 🧙🏼 Bruxo");
            System.out.println("[2] 🧛🏼 Vampiro");
            System.out.println("[3] 🕵🏼 Detetive");}

        System.out.print("Escolha um número: ");
        int escolha = leitor.nextInt();
        switch (escolha) {
            case 1:
                if (generoDoPersonagem.equals("Feminino"))
                    this.emoji = "🧙‍♀️";
                else
                    this.emoji = "🧙🏼‍♂️";
                break;
            case 2:
                if (generoDoPersonagem.equals("Feminino"))
                    this.emoji = "🧛🏻‍♀️";
                else
                    this.emoji = "🧛🏼";
                break;

            case 3:
                if (generoDoPersonagem.equals("Feminino"))
                    this.emoji = "🕵🏼‍♀️";
                else
                    this.emoji = "🕵🏼‍♂️";
                break;
        }
        limparTela();
        leitor.close();
    }
    public String getNome() {
        return this.nomeDoPersonagem;
    }
    public String getEmoji() {
        return this.emoji;
    }
    public String generoDoPersonagem() {
        return this.generoDoPersonagem;
    }

    public void limparTela() {
        System.out.println("\033[H\033[J");
        System.out.flush();
    }
}
