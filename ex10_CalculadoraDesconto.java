import java.util.Scanner;

public class CalculadoraDesconto {

    // Método que calcula o valor do desconto
    public static double calcularDesconto(double valorTotal) {
        if (valorTotal >= 100.0) {
            return valorTotal * 0.10; // 10% de desconto
        }
        return 0.0; // Sem desconto
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor;

        do {
            System.out.print("\nDigite o valor da compra (ou 0 para sair): R$ ");

            // Validação 1: Verifica se a entrada é um número e não letras/texto
            while (!teclado.hasNextDouble()) {
                System.out.println("Entrada inválida! Digite apenas números.");
                System.out.print("Digite o valor da compra (ou 0 para sair): R$ ");
                teclado.next(); // Limpa a entrada incorreta do buffer
            }

            valor = teclado.nextDouble();

            // Validação 2: Impede números negativos
            if (valor < 0) {
                System.out.println("O valor da compra não pode ser negativo.");
                continue; // Volta para o início do laço do-while
            }

            // Se o usuário digitou 0, encerra o programa
            if (valor == 0) {
                System.out.println("Encerrando a calculadora. Até mais!");
                break;
            }

            // Processamento utilizando o método
            double desconto = calcularDesconto(valor);
            double valorFinal = valor - desconto;

            // Exibição dos resultados
            System.out.println("Desconto aplicado: R$ " + desconto);
            System.out.println("Valor final a pagar: R$ " + valorFinal);

        } while (valor != 0);

        teclado.close();
    }
}