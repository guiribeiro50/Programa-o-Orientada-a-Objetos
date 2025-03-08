import java.util.Scanner;

public class Ex2_3 {
    public static String search(String[] array, int count, String target) {
        //Procurar nome
        for (int i = 0; i < count; i++) {
            if (array[i].equals(target)) {
                return "O nome existe";
            }
        }
        return "O nome não existe";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[40];
        int count = 0;
        while (count < 40) {
            System.out.print("Nome: ");
            String nome = input.nextLine();
            if (nome.equals("Stop")) {
                break;
            }
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (nomes[i].equals(nome)) {
                    System.out.println("O nome já foi inserido");
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                nomes[count] = nome;
                count++;
                for (int i = 0; i < count; i++){
                    int minIndex = i;
                    for (int j = (i + 1); j < count ; j++){
                        if (nomes[j].compareTo(nomes[minIndex]) < 0){
                            minIndex = j;
                        }
                    }
                    if (minIndex != i){
                        String temp = nomes[i];
                        nomes[i] = nomes[minIndex];
                        nomes[minIndex] = temp;
                    }
                }
            }
        }
        //Remover nome
        System.out.println("Remover item: ");
        String remove = input.nextLine();
        String[] novonomes = new String[count]; 
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (!nomes[i].equals(remove)) {
                novonomes[j] = nomes[i];
                j++;
            }
        }
        //Procurar nome
        System.out.println("Target: ");
        String target = input.nextLine();
        System.out.println(search(novonomes, j, target));
        //Dar print na lista
        System.out.println("Lista: ");
        for (int i = 0; i < j; i++) {
            System.out.println(novonomes[i]);
        }
    }
}
