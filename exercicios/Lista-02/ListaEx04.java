import java.util.Scanner;

public class ListaEx04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] [] temperatura = new double [7][3];
        String [] dias = {
                "Segunda",
                "Terca",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sabado",
                "Domingo",
        };
        String [] periodos = {
                "Manha",
                "Tarde",
                "Noite"
        };
        double maior,totalDia,mediaDia = 0, mediaSemana,total = 0;
        int diaMaior=0, periodoMaior = 0;

        for(int i = 0;i <temperatura.length;i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Digite a temperatura de " + dias[i] + " - " + periodos[j]);
                temperatura[i][j]=sc.nextDouble();
            }
        }
        System.out.println("");
        System.out.println("---------- TEMPERATURAS ----------");
        System.out.println("    Manha    Tarde    Noite");
        for(int i = 0;i <temperatura.length;i++){
            for(int j = 0; j < 2; j++){
                System.out.print(temperatura[i][j] + "    ");
            }
            System.out.println("");
        }
        for(int i = 0;i <temperatura.length;i++){
            for(int j = 0; j < 2; j++){
                total = total + temperatura [i][j];
            }
        }
        mediaSemana = total/21;
        System.out.println("");
        System.out.println("Media da semana: " + mediaSemana);

        maior = temperatura[0][0];

        for(int i = 0;i <temperatura.length;i++){
            for(int j = 0; j < 2; j++){
                if( temperatura[i][j] > maior){
                    maior = temperatura [i][j];
                    diaMaior = i;
                    periodoMaior = j;
                }

            }
        }
        System.out.println("");
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Ocorreu em: " + dias[diaMaior] + " - " + periodos[periodoMaior]);

        System.out.println("");
        System.out.println("---------- MEDIA POR DIA ----------");
        for(int i = 0;i <temperatura.length;i++){
            totalDia = 0;
            for(int j = 0; j < 2; j++){
                totalDia = totalDia + temperatura[i][j];
            }
            mediaDia = totalDia/3;
            System.out.println(dias[i]+":"+mediaDia);
        }
    }
}
