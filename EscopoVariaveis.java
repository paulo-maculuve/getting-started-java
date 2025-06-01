public class EscopoVariaveis {

    // O que é escopo?
    // Escopo é o "alcance" de uma variável — ou seja, onde ela pode ser usada no código.
    // Uma variável só pode ser acessada dentro do bloco onde foi declarada.

    // Variável de classe (escopo global da classe)
    static int numeroGlobal = 10;

    public static void main(String[] args) {

        // Variável local (só existe dentro do main)
        int numeroLocal = 5;
        System.out.println("Número local no main: " + numeroLocal);
        System.out.println("Número global no main: " + numeroGlobal);

        imprimirNumero();

        // A variável 'dentroDoIf' só existe dentro do if
        if (true) {
            int dentroDoIf = 100;
            System.out.println("Dentro do if: " + dentroDoIf);
        }

        // A linha abaixo causaria erro, pois 'dentroDoIf' está fora do escopo
        // System.out.println(dentroDoIf); // ERRO!

    }

    public static void imprimirNumero() {
       // Essa é uma variável local ao método 'imprimirNumero'
        // Mesmo que tenha o mesmo nome de uma variável do main, é uma variável diferente
        int numeroLocal = 20;
        System.out.println("Número local no método: " + numeroLocal);

        // Pode acessar 'numeroGlobal', pois é visível em toda a classe
        System.out.println("Número global no método: " + numeroGlobal);
    }
}
