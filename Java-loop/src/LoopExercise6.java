//program to take integer from user and add the digits of the given integer

import java.util.Scanner;

public class LoopExercise6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int i = input.nextInt();//ABCD
        int sum=0;
        while (i>0){
            sum += (i%10); //D
            i/=10;     //ABC
        }
        System.out.println("Sum: "+sum);


    }
}
