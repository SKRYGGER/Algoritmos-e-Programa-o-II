import java.util.Scanner;

public class ListaEx02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] aluno = {
                "Aluno 1",
                "Aluno 2",
                "Aluno 3",
                "Aluno 4",
                "Aluno 5",
                "Aluno 6",
                "Aluno 7",
                "Aluno 8",
                "Aluno 9",
                "Aluno 10"
        };

        double[] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            do{
                System.out.print("Digite as notas de " + aluno[i] + ": ");
                notas[i] = sc.nextDouble();


                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                }
            } while (notas[i] < 0 || notas[i] > 10) ;
        }

        System.out.println("\n--- Notas da Turma ---");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(aluno[i] + ": Tirou: " + notas[i]);
        }

        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        double media = total / notas.length;

        double maior = notas[0];
        double menor = notas[0];
        int maiorNota = 0;
        int menorNota = 0;

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
                menorNota = i;
            }
        }

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
                maiorNota = i;
            }
        }

        int aprovados = 0, reprovados = 0;
        for (int i = 0; i < notas.length; i++){
            if (notas[i]>=6.0){
                aprovados++;
            } else{
                reprovados++;
            }
        }

        System.out.println("Média da Turma:  " + media);
        System.out.println("Maior Nota: " + aluno[maiorNota] + " = " + maior);
        System.out.println("Menor Nota: " + aluno[menorNota] + " = " + menor);
        System.out.println("Quantidade de Alunos aprovados: " + aprovados);
        System.out.println("Quantidade de Alunos reprovados: " + reprovados);
        
    }
}
