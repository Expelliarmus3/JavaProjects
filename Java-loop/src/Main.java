
//using while loop
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int i = input.nextInt();
        while (i<1||i>10) {
            System.out.print(i + " is not between 1 and 10.Try Again: ");
            i = input.nextInt();
        }

        System.out.println(i + " is between 1 and 10. Thanks!");

//another way
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int n = s.nextInt();
        while(!(n>=1 && n<=10)){ //keeps looping this code block till condition is true
            System.out.print(n + " is not between 1 and 10.Try Again: ");
            n= s.nextInt();
        }
        System.out.println(n + " is between 1 and 10. Thanks!");//executes only if the while loop code block is false


    }
}