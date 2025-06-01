/*  O que são Construtores?
 Um construtor é um método especial que é chamado automaticamente
 quando um objeto da classe é criado.
 Ele serve para inicializar os atributos do objeto.

 Características:
 - Tem o mesmo nome da classe.
 - Não possui tipo de retorno (nem mesmo void).
 - Pode receber parâmetros para inicializar os valores do objeto.
 - Pode ser sobrecarregado (ter vários construtores com diferentes parâmetros).

 Nota: Toda classe em Java possui um construtor padrão (construtor vazio), mesmo que ele não seja explicitamente declarado. No entanto, se você definir qualquer construtor personalizado, o construtor padrão deixará de ser gerado automaticamente pelo compilador.*/

public class Construtor {

    // Atributos da classe
    String nome;
    int idade;

    // Construtor da classe
    public Construtor(String nome, int idade) {
        // A palavra-chave 'this' é usada para diferenciar
        // os atributos da classe dos parâmetros do construtor
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir os dados
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    // Método main para testar
    public static void main(String[] args) {
        // Criando um objeto já inicializando os valores através do construtor
        Construtor pessoa1 = new Construtor("Domingos Chiconela", 22);
        pessoa1.apresentar();

        Construtor pessoa2 = new Construtor("Ana", 30);
        pessoa2.apresentar();
    }
}
