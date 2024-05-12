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

//another way

        Scanner n = new Scanner(System.in);
        System.out.print("Enter your number: ");
        if ((v.nextInt()%2)==0)
            System.out.println(i2+" is even");
        else
            System.out.println(i2+" is odd");

//switch statement

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i4= s.nextInt();
        switch (i4 % 2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");

        }
//another way
        Scanner t = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i5= t.nextInt();
        switch (i5 % 2){
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }
}
