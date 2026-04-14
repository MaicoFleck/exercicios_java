import java.util.Scanner;
public class exercicios12 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = leitor.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);
    }
}