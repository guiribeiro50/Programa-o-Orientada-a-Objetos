import java.util.Scanner;
public class Ex2_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        int[][] array = new int[4][5];
        int max_index = 0;
        int max_sum = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Nº de peças na Linha " + (i + 1) + " e na " + diasSemana[j] + ": " );
                int valor = input.nextInt();
                array[i][j] = valor;
            }
        }
        //Print elementos
        for (int i = 0; i < 4; i++){
            System.out.print("\n");
            for (int j = 0; j < 5; j++){
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println("\n");
        //Média e total por linha
        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 5; j++){
                sum += array[i][j];
            }
            if (sum > max_sum){
                max_sum = sum;
                max_index = (i+1);
            }
            double media = sum / 5;
            System.out.println("Nº de peças na Linha " + (i + 1) + ": " + sum);
            System.out.println("Média de peças na Linha " + (i + 1) + ": " + media);
        }
        System.out.print("\n");
        //Média e total por coluna
        for (int j = 0; j < 5; j++){
            int sum = 0;
            for (int i = 0; i < 4; i++){
                sum += array[i][j];
            }
            double media = sum / 4;
            System.out.println("Nº de peças na " + diasSemana[j] + ": " + sum);
            System.out.println("Média de peças na " + diasSemana[j] + ": " + media);
        }
        System.out.print("\nNº da linha que produz mais peças defeituosas: " + max_index);
    }
}