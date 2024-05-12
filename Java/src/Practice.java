import java.util.Scanner;

//nested if else statement

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n= input.nextInt();
        if (n>10)
            System.out.println("Greater than 10");
        else
            if (n==10)
                System.out.println("Equal to 10");
            else
                System.out.println("Less than 10");


//another way

        int v = 3;
        if (v>10)
            System.out.println(">10");
        else if (v==10)
            System.out.println("=10");
        else
            System.out.println("<10");



    }
}
