import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int[] mat = new int[5];
            String[] nome = new String[5];
            float[] a = new float[5];
            float[] b = new float[5];
            float[] notaFinal = new float[5];
            
            System.out.print("Digite sua matrícula: ");
            mat[i] = scanner.nextInt();

            System.out.print("Digite seu nome: ");
            nome[i] = scanner.next();

        System.out.print("Digite suas duas notas: ");
        a[i] = scanner.nextFloat();
        b[i] = scanner.nextFloat();

        notaFinal[i] = (a[i] + b[i]) / 2;

        if (notaFinal[i] >= 6) {
            System.out.printf("Matrícula: %d\nNome: %s\nAprovado? (X) Sim ( ) Não\nNota final: %.2f\n", mat[i], nome[i], notaFinal[i]);
        } else {
            System.out.printf("Matrícula: %d\nNome: %s\nAprovado? ( ) Sim (X) Não\nNota final: %.2f\n", mat[i], nome[i], notaFinal[i]);
        }
    }
    }
}
