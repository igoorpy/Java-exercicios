import java.util.Scanner;

public class ex2_ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano você nasceu?: ");
        int nasc = teclado.nextInt();
        int idade = 2026 - nasc;
        
        System.out.println("Sua idade é: " + idade);

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        teclado.close();
    }
}