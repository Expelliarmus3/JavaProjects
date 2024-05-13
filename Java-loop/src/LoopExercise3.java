//printing and getting the sum of strict divisors
// i.e. all divisors except the number itself

import java.util.Scanner;

public class LoopExercise3 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        for (int i=1;i<=(n/2);i++){
            if(n%i==0) {
                System.out.print(i+" ");
                sum +=i;
            }
        }
        System.out.println();
        System.out.println("The sum is: "+sum);
    }
}
