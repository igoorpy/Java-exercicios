import java.util.Scanner;

public class ex6_Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = teclado.nextInt();

        System.out.println("Tabuada do " + numero);

        // Estrutura de repetição 'for' (de 1 até 10)
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        teclado.close();
    }
}