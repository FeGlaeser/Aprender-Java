public class Caracteristica {
    public static void main(String[] args) {
        for (int x = 1000; x != 10000; x++) {
            int centenas = x / 100;
            int dezenas = x - centenas * 100;
            int soma = dezenas + centenas;
            if (soma * soma == x) {System.out.println(x);}
        }
    } 
}
