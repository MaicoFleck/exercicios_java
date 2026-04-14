import java.util.Scanner;

public class exercicios15 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = leitor.nextDouble();
        
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da esfera: " + volume);
    }
}