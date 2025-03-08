import java.util.Scanner;
public class Ex1_3{
    public static void main(String[] args){
        String[] numbers = new String[100];
        int[] notas = new int[100];
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Número: ");
            String number = input.nextLine();
            numbers[i] = number;
            System.out.println("Nota: ");
            int nota = input.nextInt();
            notas[i] = nota;
            sum += nota;
        }
        double media = sum / 3;
        for (int i = 0; i < notas.length; i++){
            if (notas[i] > media){
                System.out.print("Número do aluno: " + numbers[i] + "\n");
                System.out.print("Nota do aluno: " + notas[i] + "\n");
            }
        }
    }
}