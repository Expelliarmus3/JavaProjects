
//calculator

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 operator num2 (example: 1 + 2): ");
        double num1= input.nextDouble();
        char operator = input.next().charAt(0);
        double num2= input.nextDouble();
        if (operator=='+')
            System.out.println("The result is: "+(num1+num2));
        else if (operator=='-')
            System.out.println("The result is: "+(num1-num2));
        else if (operator=='*')
            System.out.println("The result is: "+(num1*num2));
        else if (operator=='/')
            System.out.println("The result is: "+(num1/num2));
        else
            System.out.println("Invalid operator");

//using switch (using explicit casting)

        Scanner n = new Scanner(System.in);
        System.out.print("Enter num1 operator num2 (example: 1 + 2): ");
        int num3= n.nextInt();
        char operator1 = n.next().charAt(0);
        int num4= n.nextInt();
        switch (operator1){
            case '+':
                System.out.println("The result is: "+(double)(num3+num4));  //here we are doing explicit casting
                break;
            case '-':
                System.out.println("The result is: "+(double)(num3-num4));
                break;
            case '*':
                System.out.println("The result is: "+(double)(num3*num4));
                break;
            case '/':
                System.out.println("The result is: "+(double)(num3/num4));
                break;
            default:
                System.out.println("Invalid operator");
        }


//a little more changes (without casting)
        Scanner t = new Scanner(System.in);
        System.out.print("Enter num1 operator num2 (example: 1 + 2): ");
        double num5= t.nextDouble();
        char op = t.next().charAt(0);
        double num6= t.nextDouble();
        switch (op){
            case '+':
                System.out.println("The result is: "+(num5+num6));
                break;
            case '-':
                System.out.println("The result is: "+(num5-num6));
                break;
            case '*':
                System.out.println("The result is: "+(num5*num6));
                break;
            case '/':
                System.out.println("The result is: "+(num5/num6));
                break;
            default:
                System.out.println("Invalid operator");
        }



    }
}
