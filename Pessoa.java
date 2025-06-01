// O que é POO?
// POO (Programação Orientada a Objetos) é um paradigma de programação que organiza o código em torno de objectos.
// Objetos são instâncias de classes, e representam entidades do mundo real.
// Cada objeto tem:
// - Atributos (características)
// - Métodos (ações que ele pode realizar)



public class Pessoa {

    // Atributos da classe (características )
    String nome;
    int idade;

    // Método da classe (ações que uma pessoa pode fazer)
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    // Método principal para executar o programa
    public static void main(String[] args) {

        // Criando um objecto da classe Pessoa ou seja instancia
        Pessoa p1 = new Pessoa();

        // Atribuindo valores aos atributos
        p1.nome = "Lucas";
        p1.idade = 20;

        // Chamando o método do objecto
        p1.apresentar();

        // Criando outro objecto com outros valores
        Pessoa p2 = new Pessoa();
        p2.nome = "Mariana";
        p2.idade = 25;
        p2.apresentar();
    }
}
