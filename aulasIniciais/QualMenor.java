import java.util.Scanner;

    public class QualMenor {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número inteiro: ");
            int nu = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int nd = scanner.nextInt();

            scanner.close();

            if (nu > nd) {
                System.out.print(nu + " é o maior número, enquanto " + nd + " é o menor.");
            } else if (nd > nu) {
                System.out.print(nd + " é o maior número, enquanto " + nu + " é o menor.");
            } else {
                System.out.print("Os dois números são iguais.");
            }

        }
    }
