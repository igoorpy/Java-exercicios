import java.util.Scanner;

public class ex5_SimuladorCaixaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor do saque: R$ ");
        int valorSaque = teclado.nextInt();

        // Variáveis de controle
        int valorRestante = valorSaque; // Saldo que ainda falta pagar
        int notaAtual = 50;             // Começa tentando a maior cédula
        int totalNotas = 0;             // Contador de notas emitidas da cédula atual

        // Repetição principal: executa enquanto houver valor a ser sacado
        while (valorRestante > 0) {
            
            // Se o saldo for maior ou igual à nota atual, desconta o valor
            if (valorRestante >= notaAtual) {
                valorRestante -= notaAtual; // Desconta o valor da nota do saldo
                totalNotas++;               // Soma 1 no contador de notas
            } else {
                // Se já contamos alguma nota do tipo anterior, exibe o total
                if (totalNotas > 0) {
                    System.out.println(totalNotas + " nota(s) de R$ " + notaAtual);
                }

                // Troca a nota para a próxima menor
                if (notaAtual == 50) {
                    notaAtual = 20;
                } else if (notaAtual == 20) {
                    notaAtual = 10;
                }

                // Reseta a contagem para a nova nota
                totalNotas = 0;

                // Segurança: impede loop infinito se o valor não for múltiplo de 10
                if (valorRestante < 10 && valorRestante > 0) {
                    System.out.println("Valor restante (R$ " + valorRestante + ") indisponível para saque.");
                    break;
                }
            }
        }

        // Exibe a contagem do último tipo de nota emitida
        if (totalNotas > 0) {
            System.out.println(totalNotas + " nota(s) de R$ " + notaAtual);
        }

        teclado.close();
    }
}