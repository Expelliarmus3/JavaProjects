//program to find the nth number of the fibonacci series

import java.util.Scanner;

public class LoopExercise7 {
    public static void main(String[] args) {
        //1,1,2,3,5,8,13,21,34...
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number position: ");
        int n = input.nextInt();
        int v1 =1;
        int v2=1;
        int result=0;
        int i = 1;
        while(i<= (n-2)){
           result= v1+v2;
           v1=v2;
           v2=result;
           i++;
        }
        System.out.println("The number is: "+(result==0?1:result));
    }
}
