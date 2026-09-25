import java.util.Scanner;

public class ex3_ProgramaVotacao{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Em que ano você nasceu? ");
        int nasc = teclado.nextInt(); 
        int idade = 2026 - nasc;      
        System.out.println("Sua idade: " + idade + " anos.");

        // Estrutura condicional aninhada (várias condições)
        if (idade < 16) {
            System.out.println("Situação: Não vota.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Situação: Voto opcional.");
        } else {
           
            System.out.println("Situação: Voto obrigatório!");
        }
        teclado.close();
    }
}