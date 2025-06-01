/* 
  O que são Modificadores de Acesso?
  São palavras-chave que definem a visibilidade (ou seja, quem pode acessar) os atributos, métodos ou classes.
  
  Modificadores :
  1. public    - Acessível de qualquer lugar.
  2. private   - Acessível apenas dentro da própria classe.
  3. protected - Acessível dentro do mesmo pacote ou por subclasses.
  4. (default) - Sem modificador explícito: acessível apenas dentro do mesmo pacote.
 */

public class ModificadorAcesso {

    // Atributo público: pode ser acessado de qualquer lugar
    public String nome;

    // Atributo privado: só pode ser acessado dentro desta classe
    private double saldo;

    // Construtor para inicializar os atributos
    public ModificadorAcesso(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    // Método público: qualquer classe pode chamar este método
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }

    // Método privado: apenas esta classe pode usar
    private void mensagemInterna() {
        System.out.println("Este método é privado e só pode ser acessado internamente.");
    }

    public static void main(String[] args) {
        ModificadorAcesso conta = new ModificadorAcesso("Domingos Chiconela", 1000.0);
        
        // Acessando atributo público
        System.out.println("Nome do titular: " + conta.nome);

        // Acessando método público
        conta.exibirInformacoes();

        // Não é possível acessar diretamente o atributo privado ou o método privado:
        // conta.saldo = 500;              // ERRO de compilação
        // conta.mensagemInterna();        // ERRO de compilação
    }
}
