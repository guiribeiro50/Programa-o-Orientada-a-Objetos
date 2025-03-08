import java.util.Scanner;
public class Ex1_6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lengh of the array: ");
        int n = input.nextInt();
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Number: ");
            int number = input.nextInt();
            vetor1[i] = number;
            if (i + 1 % 2 == 0){
                vetor2[i] = vetor1[i] * 2;
            }
            else {
                vetor2[i] = vetor1[i] * 3;
            }
        }
        System.out.println("Vetor 1: ");
        for (int i = 0; i < vetor1.length; i++){
            System.out.print(vetor1[i] + " ");
        }
        System.out.println("\nVetor 2: ");
        for (int i = 0; i < vetor2.length; i++){
            System.out.print(vetor2[i] + " ");
        }
    }
}