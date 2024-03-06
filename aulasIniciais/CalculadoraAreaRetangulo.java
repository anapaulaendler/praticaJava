import java.util.Scanner;

public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo: ");
        
        double altura = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");

        double largura = scanner.nextDouble();

        scanner.close();

        double area = altura * largura;

        System.out.println("A área do retângulo é: " + area);
    }
}
