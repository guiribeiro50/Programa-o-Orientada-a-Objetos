import java.util.Scanner;
public class Ex1_7{
    public static void main(String[] args){
        String[][] array = new String[4][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Nome do Residente: ");
                String nome = input.next();
                array[i][j]= nome;
            }
        }
        System.out.println("Target: ");
        String target = input.next();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                if (array[i][j].equals(target)){
                    System.out.println("Entrada: " + (i + 1));
                    System.out.println("Andar: " + (j + 1));
                }
            }
        }
    }
}