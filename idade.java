import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade, em anos: ");

        int idadeAtual = scanner.nextInt();

        scanner.close();

        if (idadeAtual <= 13) {
            System.out.print("Criança");
        } else if (idadeAtual > 13 && idadeAtual <= 18) {
            System.out.print("Adolescente");
        } else if (idadeAtual > 18 && idadeAtual <= 60) {
            System.out.print("Adulto");
        } else {
            System.out.print("Idoso");
        }

    }


}