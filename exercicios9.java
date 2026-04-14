import java.util.Scanner;

public class exercicios9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in) ;
        double numero1 ;
        double numero2 ;
        double numero3 ;
        double numero4 ;

        System.out.println ("digite o numero1");
        numero1 = leitor.nextDouble() ;
        System.out.println ("digite o numero2");
        numero2 = leitor.nextDouble() ;
        System.out.println ("digite o numero3");
        numero3 = leitor.nextDouble() ;
        System.out.println ("digite o numero4");
        numero4 = leitor.nextDouble() ;

        double media = (numero1 + numero2 + numero3 + numero4) /4 ;
        System.out.println("o resultado da soma é " + media);

        leitor.close();
    }
}