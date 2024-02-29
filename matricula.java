import java.util.Scanner;

public class matricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua matrícula: ");
        int mat = scanner.nextInt();

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite suas duas notas: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        float notaFinal = (a + b) / 2;

        if (notaFinal >= 6) {
            System.out.printf("Matrícula: %d\nNome: %s\nAprovado? (X) Sim ( ) Não\nNota final: %.2f\n", mat, nome, notaFinal);
        } else {
            System.out.printf("Matrícula: %d\nNome: %s\nAprovado? ( ) Sim (X) Não\nNota final: %.2f\n", mat, nome, notaFinal);
        }
    }
}
