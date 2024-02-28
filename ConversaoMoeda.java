import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantia de dinheiro, em reais: R$ ");

        double real = scanner.nextDouble();
        
        System.out.print("Em dólares, isso dá: $ " + real * 5.17 + "\nEm euros, isso dá: € " + real * 6.14 + "\nEm peso argentino, isso dá: ARS " + real * 0.05);

    }
}