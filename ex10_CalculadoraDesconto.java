import java.util.Scanner;

public class ex10_CalculadoraDesconto {

    // MÉTODO 1: Recebe o valor da compra e retorna quanto de desconto o cliente ganha
    public static double calcularDesconto(double valorTotal) {
        // Estrutura condicional para definir a porcentagem
        if (valorTotal >= 100.0) {
            return valorTotal * 0.10; // Retorna 10% do valor
        } else {
            return 0.0; // Sem desconto
        }
    }

    // MÉTODO PRINCIPAL (Ponto de entrada da aplicação)
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valor = teclado.nextDouble();

        // Chamando o método 'calcularDesconto' e guardando o retorno dele
        double desconto = calcularDesconto(valor);
        double valorFinal = valor - desconto;

        // Exibição dos resultados
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        teclado.close();
    }
}