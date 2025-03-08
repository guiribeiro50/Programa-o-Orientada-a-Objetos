import java.util.Scanner;
public class Ex2_1{
    public static String search(String[] array, int count, String target){
        for (int i = 0; i < count; i++){
            if (array[i].equals(target)){
                return "O nome existe";
            }
        }
        return "O nome não existe";
    }
    public static void main(String[] args){
        String[] lista = new String[20];
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (count < 20){
            System.out.println("Enter a name: ");
            String name = input.next();
            if (name.equals("Stop")){
                break;
            }
            boolean exists = false;
            for (int i = 0; i < count; i++){
                if (lista[i].equals(name)){
                    System.out.println("Esse nome já foi inserido");
                    exists = true;
                    break;
                }
            }
            if (!exists){
                lista[count] = name;
                count++;
            }
            
        }
        System.out.println("Target: ");
        String target = input.next();
        System.out.println(search(lista,count,target));
        System.out.println("Lista: ");
        for (int i = 0; i < count; i++){
            System.out.println(lista[i]);
        }
    }
}