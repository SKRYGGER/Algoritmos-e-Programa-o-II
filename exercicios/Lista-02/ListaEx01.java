import java.util.Scanner;

public class ListaEx01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dias = {
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado",
                "Domingo"
        };

        double[] gastos = new double[7];

        // Lendo os gastos
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o gasto de " + dias[i] + ": ");
            gastos[i] = sc.nextDouble();
        }

        // Exibindo os gastos
        System.out.println("\n--- Gastos da semana ---");

        for (int i = 0; i < 7; i++) {
            System.out.println(dias[i] + ": R$ " + gastos[i]);
        }

        // Calculando o total
        double total = 0;

        for (int i = 0; i < 7; i++) {
            total += gastos[i];
        }

        // Calculando a média
        double media = total / 7;

        // Encontrando o maior gasto
        double maior = gastos[0];
        int diaMaior = 0;

        for (int i = 1; i < 7; i++) {
            if (gastos[i] > maior) {
                maior = gastos[i];
                diaMaior = i;
            }
        }

        // Exibindo os resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Total gasto: R$ " + total);
        System.out.println("Média por dia: R$ " + media);
        System.out.println("Maior gasto: " + dias[diaMaior] + " = R$ " + maior);

    }
}