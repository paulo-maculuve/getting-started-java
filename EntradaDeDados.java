import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

           System.out.print("DIgite o seu sexo M ou F: ");
        char sexo = sc.next().charAt(0);

        System.out.println("Olá, " + nome + ". Sua idade é " + idade + " anos" + ". Do sexo " + sexo);
    }
}
