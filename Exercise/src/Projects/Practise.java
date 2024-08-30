package Projects;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        //question 1
//        int a = 10;
//        if (a==11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");
//question 2
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter marks of subject 1 (out of 100): ");
//        int sub1 = input.nextInt();
//        System.out.println("Enter marks of subject 2 (out of 100): ");
//        int sub2 = input.nextInt();
//        System.out.println("Enter marks of subject 3 (out of 100): ");
//        int sub3 = input.nextInt();
//
//        int total= (sub1+sub2+sub3);
//        if (total>=40&& sub1>=33 && sub2>=33 && sub3>=33)
//            System.out.println("Student has passed");
//        else
//            System.out.println("Student has failed");

//question 3

//        System.out.print("Enter your income: ");
//        float income = input.nextFloat();
//        float tax=0;
//        if (income>= 2.5f && income< 5f) {
//            tax += 0.05f * (income-2.5f);
//            System.out.println("Your tax is: "+tax);
//        }
//        else if (income>= 500000 && income< 1000000) {
//            tax += 0.05f * (5f-2.5f);
//            tax += 0.2f*(income-5f);
//            System.out.println("Your tax is: "+tax);
//        }
//        else if (income>= 10f) {
//            tax += 0.05f * (5f-2.5f);
//            tax += 0.2f*(10f-5f);
//            tax += 0.3f * (income-10f) ;
//            System.out.println("Your tax is: "+tax);
//        }
//        else
//            System.out.println("No tax applicable");

//question 4
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }

//question 5

        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if (year%4==0)
            System.out.println("It is leap year");
        else
            System.out.println("It is not a leap year");

//question 6

        String website = input.next();
        if (website.endsWith(".org"))
            System.out.println("Thi is organizational website");
        if (website.endsWith(".com"))
            System.out.println("Thi is commercial website");
        if (website.endsWith(".in"))
            System.out.println("Thi is Indian website");

    }
}
