import java.util.Scanner;

    public class cincoNotas {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite sua matrícula: ");
            int mat = scanner.nextInt();
            
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();
            
            int i = 0;
            int[] notas = new int[5];
            
            while (i < 5) {
                
                System.out.printf("Digite sua nota %d: ", i + 1);
                int p = scanner.nextInt();
                
                if (p >= 0 && p <= 10) {
                    notas[i] = p;
                    i++;
                }
                
            }
            
            System.out.printf("Matricula: %d\nNome: %s\n", mat, nome);
            
            for (i = 0; i < 5; i++) {
                System.out.printf("Nota (%d): %d\n", i, notas[i]);
            }
        }
    }
