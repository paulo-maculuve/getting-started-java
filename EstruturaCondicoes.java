
public class EstruturaCondicoes {

    public static void main(String[] args) {
        /*    
        Estruturas de Decisão (if, else, else if)
        São instruções que tomam decisões com base em condições.
        
        Sintaxe (Estrutura)
        if (condição) {
            // se a condição for verdadeira
        } else if (outraCondição) {
            // se a outra condição for verdadeira
        } else {
            // se nenhuma condição for verdadeira
        }
   
         */
        int idade = 18;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("Tem exatamente 18 anos");
        } else {
            System.out.println("Maior de idade");
        }

        /* 
        Operadores Lógicos:
            == igual
            != diferente
            > maior
            < menor
            >= maior ou igual
            <= menor ou igual
            && E lógico
            || OU lógico
         */
 /*
        * 
        Use switch-case quando

        Você tem uma variável (normalmente int, char, String, double ...)
        E deseja comparar essa variável com vários valores fixos

        Sintaxe (Estrutura)

        switch (variavel) {
            case valor1:
                // código se for igual a valor1
                break;
            case valor2:
                // código se for igual a valor2
                break;
            default:
                // código se não for nenhum dos anteriores
        }

        O break serve para parar a execução após encontrar o case correspondente.
        O default é opcional, e funciona como o else do if.
        * 
         */
        int dia = 3;

        // Primeiro exemplo
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Segundo exemplo
        String comando = "iniciar";

        switch (comando) {
            case "iniciar":
                System.out.println("Sistema iniciado");
                break;
            case "parar":
                System.out.println("Sistema parado");
                break;
            case "reiniciar":
                System.out.println("Sistema reiniciado");
                break;
            default:
                System.out.println("Comando desconhecido");
        }

    }
}
