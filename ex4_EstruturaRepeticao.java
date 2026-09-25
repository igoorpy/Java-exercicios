public class ex4_EstruturaRepeticao {
    public static void main(String[] args) {
        // 1. Variável de controle (começa em 10)
        int contador = 10;

        System.out.println("Iniciando contagem regressiva...");

        // 2. Estrutura de repetição: ENQUANTO o contador for maior que 0
        while (contador > 0) {
            System.out.println(contador);
            
            // 3. Decremento: diminui 1 do valor atual do contador (mesmo que contador = contador - 1)
            contador--; 
        }

        // 4. Mensagem final após o término do loop
        System.out.println("🚀 Decolar!");
    }
}