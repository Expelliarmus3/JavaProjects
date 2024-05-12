//Lucky number ABCD if A+B=C+D

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four digit number: ");
        int n= input.nextInt();
        if (!(n>999 && n<10000)) //check if entered number is 4 digit or not
            System.out.println(n+" is not a four digit number");
        else

            if (((n/10)%10)+(n%10)==((n/100)%10)+(n/1000))
                System.out.println("It is a lucky number");
            else
                System.out.println("It is not a lucky number");


// Detailed explanation

        Scanner t = new Scanner(System.in);
        System.out.print("Enter four digit number: ");
        int num = t.nextInt();
        if (!(num>999 && num<10000))
            System.out.println(num+" is not a four digit number");
        else {
            //Extracting digits from ABCD
            int num4 = num % 10; //ABCD % 10 = D
            int num3 = (num / 10) % 10; // ABC % 10= C
            int num2 = (num / 100) % 10; // AB %10=B
            int num1 = (num / 1000) % 10; // A

            if (num1 + num2 == num3 + num4)
                System.out.println("It is a lucky number");
            else
                System.out.println("It is not a lucky number");
        }
    }
}
