
import java.util.Scanner;

public class ArrayComScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[3];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();
        }

        System.out.println("Lista de alunos:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
