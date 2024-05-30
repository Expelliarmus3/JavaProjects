import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistex2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        while (true){
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display element");
            System.out.println("4. Exit");
            System.out.print("your choice: ");
            int num = s.nextInt();
            if (num==1){
                System.out.print("Enter element: ");
                int n = s.nextInt();
                integers.add(n);
                System.out.println("Added");
            }
            if (num==2){
                System.out.print("Enter element to be removed: ");
                int n = s.nextInt();
                if (integers.contains(n)) {
                    integers.remove(Integer.valueOf(n));
                    System.out.println("Removed");
                }
                else
                    System.out.println("Element not found");
            }
            if (num==3){
                System.out.println("Your list: "+integers);
            }
            if (num==4) {
                System.out.println("Bye");
                break;
            }
        }
    }
}
