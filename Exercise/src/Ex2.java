import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int i= 10;
        int k= 10;
        int j= 10;
        int sum = (i+j+k);
        System.out.println(sum);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s=input.next();
        System.out.println("Hello "+s+" Have a good day!");


        System.out.print("Enter distance in kilometers: ");
        double d = input.nextDouble();
        System.out.println("Distance in metres is: "+(d*1000));

        System.out.print("Enter your number: ");
        System.out.println(input.hasNextInt());
    }
}
