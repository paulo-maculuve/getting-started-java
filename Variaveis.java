public class Variaveis {

/*
O que é uma variável?
Uma variável é como uma caixa onde você guarda um valor que pode mudar durante a execução do programa.

Regras para nomear variáveis:
1. Devem começar com letra minúscula
2. Evite usar acentos ou símbolos especiais
3. Evite nomes curtos demais (como x, y) sem contexto
4. Use nomes significativos: nomeAluno, idade, precoProduto
5. Use camelCase para nomes compostos: nomeCompleto, dataNascimento
*/
    public static void main(String[] args) {
        String nome = "Ana";           // texto
        int idade = 20;                // número inteiro
        double altura = 1.68;          // número com vírgula
        boolean matriculada = true;    // verdadeiro ou falso

        // Exibir informações
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Está matriculada? " + matriculada);
    }
}
