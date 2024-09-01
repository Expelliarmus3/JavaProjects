package Projects;

import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {

//question 1
//        for (int i=0;i<=3;i++){
//            for (int j=3;j>=i;j--)
//                System.out.print("*");
//            System.out.println();
//        }

//question 2

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your n: ");
//        int n = input.nextInt();
//        int i =0;
//        int sum=0;
//        while (i<=n){
//            if (i%2==0)
//                sum+=i;
//            i++;
//        }
//        System.out.println("The sum is: "+sum);

//question 3
//
//        System.out.print("Enter your number: ");
//        int j= input.nextInt();
//        int t=1;
//        while (t<=10){
//            System.out.print(j+"x"+t+"="+j*t);
//            System.out.println();
//            t++;
//        }
//
////question 4
//
//        int q=10;
//        int m = 10;
//        while(m>=1){
//            System.out.print(q+"x"+m+"="+q*m);
//            System.out.println();
//            m--;
//        }

//question 5

//        System.out.print("Enter your number: ");
//        int f = input.nextInt();
//        int fac=1;
//        for (int r=1;r<=f;r++)
//            fac*= r;
//        System.out.println("The factorial of "+f+" is "+fac);


//question 6

        int num = 8;
        int i = 10;
        int sum =0;
        while(i>0){
            int mul=num*i;
            sum+=mul;
            i--;
        }
        System.out.println("The sum is "+sum);
    }
}
