import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i ;
        do {
            System.out.print("Enter a number between 1 and 10: ");//this is the first iteration
            i = s.nextInt();
        }while (i<1||i>10);
        System.out.println(i + " is between 1 and 10. Thanks!");
    }
}
