import java.util.Scanner;

//code using only if

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i1= input.nextInt();

        if (i1%2==0)
            System.out.println(i1+" is even");
        if (i1%2 !=0)
            System.out.println(i1+" is odd");


//another way for the previous code using if-else

        Scanner v = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i2= v.nextInt();

        if (i2%2==0)
            System.out.println(i2+" is even");
        else
            System.out.println(i2+" is odd");

    }
}
