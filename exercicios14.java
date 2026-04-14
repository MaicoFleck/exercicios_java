import java.util.Scanner;

public class exercicios14 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = leitor.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = leitor.nextDouble();
        
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume do cilindro: " + volume);
    }
}