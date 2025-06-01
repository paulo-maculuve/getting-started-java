
public class EstruturaRepeticao {

    /*
     * Estruturas de Repetição (Loops)
     * 
     * São estruturas que permitem repetir um bloco de código várias vezes.
     

     FOR (para um número conhecido de repetições)

    for (início; condição; incremento) {
        // código repetido
    }
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }


        /*WHILE (enquanto a condição for verdadeira) */

        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++;
        }

        // DO-WHILE (executa pelo menos uma vez)
        
        i = 1;
        do {
            System.out.println("Valor: " + i);
            i++;
        } while (i <= 5);
    }
}
