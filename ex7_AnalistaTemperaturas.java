public class ex7_AnalistaTemperaturas {
    public static void main(String[] args) {
        // Criando e preenchendo o vetor com as temperaturas da semana (7 elementos)
        double[] temps = {31.5, 33.0, 29.8, 32.2, 35.1, 30.0, 28.5};

        // length retorna o tamanho do vetor (neste caso, 7)
        int totalDias = temps.length;
        double soma = 0;

        // Primeiro laço 'for': Percorre o vetor para somar todas as temperaturas
        for (int i = 0; i < totalDias; i++) {
            soma += temps[i]; // Acumula o valor de cada posição do vetor
        }

        // Calculando a média semanal
        double media = soma / totalDias;
        System.out.println("Tamanho do vetor: " + totalDias + " dias");
        System.out.printf("Média de temperatura da semana: %.2f °C\n\n", media);

        System.out.println("--- Dias com temperatura acima da média ---");

        //Segundo laço 'for': Compara cada posição do vetor com a média calculada
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > media) {
                System.out.println("Dia " + (i + 1) + ": " + temps[i] + " °C");
            }
        }
    }
}