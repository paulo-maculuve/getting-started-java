 public class Metodo {

    public static void main(String[] args) {

        // O que são métodos?
        // Métodos são blocos de código reutilizáveis que executam uma tarefa específica.

        // Estrutura de um método:
        // modificador   static   tipoDeRetorno   nomeDoMetodo(parâmetros) { corpo }
        //
        // - modificador: define quem pode acessar o método. Ex: public
        // - static: indica que o método pode ser chamado sem criar um objeto da classe 
        //           (falaremos mais sobre isso quando estudarmos Programação Orientada a Objetos - POO)
        // - tipoDeRetorno: define o tipo de dado que o método devolve.
        //           Se o método não retorna nada, usamos "void".
        //           Se ele retorna algum valor, indicamos o tipo desse valor.
        //           Ex: o método somar retorna um número inteiro, por isso usamos "int" antes do nome.
        // - nomeDoMetodo: o nome que damos ao método (deve ser descritivo e seguir o padrão camelCase)
        // - parâmetros: dados que o método recebe para executar sua tarefa
        // - corpo: o bloco de código que define o que o método faz

        // Chamando os métodos
        saudacao("Ana");
        int soma = somar(5, 3);
        System.out.println("Soma: " + soma);
    }

    // Criando os métodos

    // Método sem retorno (tipo void)
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome);
    }

    // Método com retorno (retorna um valor do tipo int)
    public static int somar(int a, int b) {
        return a + b;
    }
}
