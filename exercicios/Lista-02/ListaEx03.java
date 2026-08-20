import java.util.Scanner;

public class ListaEx03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[8];
        int[] estoque = new int[8];

        // Cadastro
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = sc.nextLine();

            System.out.println("Digite a quantidade em estoque: ");
            estoque[i] = sc.nextInt();
            sc.nextLine();
        }

        // Exibir estoque
        System.out.println("\n--- Estoque ---");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(
                    "Produto: " + produtos[i] +
                            " | Estoque: " + estoque[i]
            );
        }

        // Estoque baixo
        System.out.println("\n--- Estoque Baixo ---");

        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] < 5) {
                System.out.println(produtos[i] + " - " + estoque[i]);
            }
        }

        // Maior estoque
        int maiorEstoque = estoque[0];
        int produtoMaior = 0;

        for (int i = 1; i < estoque.length; i++) {
            if (estoque[i] > maiorEstoque) {
                maiorEstoque = estoque[i];
                produtoMaior = i;
            }
        }

        System.out.println(
                "Maior estoque: " +
                        produtos[produtoMaior] +
                        " - " +
                        maiorEstoque
        );

        // Busca do produto
        System.out.println("\nDigite o nome do produto: ");
        String busca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i].equalsIgnoreCase(busca)) {

                encontrado = true;

                System.out.println(
                        "Estoque disponível: " + estoque[i]
                );

                System.out.println(
                        "Digite a quantidade que deseja vender:"
                );

                int quantidadeVendida = sc.nextInt();

                if (quantidadeVendida <= 0) {

                    System.out.println("Quantidade inválida!");

                } else if (quantidadeVendida <= estoque[i]) {

                    estoque[i] -= quantidadeVendida;

                    System.out.println("Venda realizada!");
                    System.out.println(
                            "Novo estoque: " + estoque[i]
                    );

                } else {

                    System.out.println("Estoque insuficiente!");
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }

    }
}