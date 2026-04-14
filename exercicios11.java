import java.util.Scanner;
public class exercicios11 {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 2 números:");
        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        
        double media = 2 / ((1/n1) + (1/n2));
        System.out.println("Média : " + media);
    }
}