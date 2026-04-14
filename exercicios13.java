import java.util.Scanner;
public class exercicios13 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o diâmetro: ");
        double diametro = leitor.nextDouble();
        double raio = diametro / 2;
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);
    }
}