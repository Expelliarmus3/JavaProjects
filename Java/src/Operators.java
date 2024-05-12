import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i1= input.nextInt();

        if (i1%2==0)
            System.out.println(i1+" is even");
        if (i1%2 !=0)
            System.out.println(i1+" is odd");
    }
}
