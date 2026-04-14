import java.util.Scanner ;

public class exercicios10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        double n3 = leitor.nextDouble();
        
        double media = Math.pow(n1 * n2 * n3, 1.0/3.0);
        System.out.println("Média Geométrica: " + media);
    }
}