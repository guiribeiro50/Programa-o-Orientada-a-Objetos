import java.util.Scanner;

public class Ex3 {
    public static int search(String[] array, String target, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i].equals(target)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos nomes deseja ler?");
        int n = input.nextInt();
        input.nextLine(); 
        String[] array = new String[n];
        int i = 0;
        
        // Ler nomes
        while (i < n) {
            System.out.println("Nome: ");
            String nome = input.nextLine();
            if (nome.equals("Stop")) {
                break;
            }
            array[i] = nome;
            i++;
        }
        
        // Print lista
        System.out.print("\n");
        System.out.println("Lista: ");
        for (int j = 0; j < i; j++) {
            System.out.println(array[j]);
        }
        System.out.print("\n");
        // Contar e imprimir o nº de vezes que um dado nome ocorre
        System.out.println("Target: ");
        String target = input.nextLine();
        int count = search(array, target, i);
        System.out.println("The target '" + target + "' appears " + count + " times");

        // Remover nome
        System.out.print("\n");
        System.out.println("Remover: ");
        String remove = input.nextLine();
        int length = 0;
        for (int j = 0; j < i; j++) {
            if (!array[j].equals(remove)) {
                length++;
            }
        }

        String[] novoArray = new String[length];
        int k = 0;
        for (int j = 0; j < i; j++) {
            if (!array[j].equals(remove)) {
                novoArray[k] = array[j];
                k++;
            }
        }
        System.out.print("\n");
        // Print nova lista
        System.out.println("Lista: ");
        for (int j = 0; j < length; j++) {
            System.out.println(novoArray[j]);
        }
    }
}
