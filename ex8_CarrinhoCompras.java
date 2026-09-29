public class ex8_CarrinhoCompras {
    public static void main(String[] args) {
        //Criando o vetor com os preços dos produtos no carrinho
        double[] precos = {12.50, 5.90, 29.90, 8.00, 15.40};

        // O .length diz quantos itens existem no vetor (neste caso, 5)
        int quantidadeItens = precos.length;
        double total = 0;

        System.out.println("Suas compras:");

        // Percorrendo o vetor do início (índice 0) até o fim
        for (int i = 0; i < quantidadeItens; i++) {
            // Imprime o número do item na tela (i + 1) e o preço do item na posição i
            System.out.println("Item " + (i + 1) + ": R$ " + precos[i]);

            // Somando o preço do item atual ao total acumulado
            total += precos[i]; 
        }

        System.out.println("Total de produtos: " + quantidadeItens);
        System.out.printf("Valor Total a Pagar: R$ %.2f\n", total);
    }
}