public class teste {
    public static void main(String[] args) {
        String cpf = "046568880";
        int soma, index;

        for (int y = 2; y != 0; y --) {
            index = 0; soma = 0;

            for (int x = cpf.length() + 1; x != 1; x--){
                soma = soma + Integer.parseInt(Character.toString(cpf.charAt(index))) * x;
                index += 1;}

            soma = soma % 11;
            soma = 11 - soma;

            if (soma >= 10) {cpf += "0";}
            else {cpf += String.valueOf(soma);}}
        System.out.print(cpf);
    }
    
}
