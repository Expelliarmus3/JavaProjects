//checking prime no.s
//method 1
import java.util.Scanner;

public class LoopExercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no.s: ");
        int sum = 0;
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) { //extracting divisors
            if (n % i == 0) {
                System.out.print("Divisor is " + i + " ");
                sum += i; //extracting sum of divisors
            }
        }
        System.out.println();
//        System.out.println(sum+" ");
        if (sum > (n + 1)) { //using sum of divisors for checking prime
            System.out.println("The no. is not prime");
        } else
            System.out.println("The no. is prime");


//method 2
//sum of strict divisors should be 1

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your no.s: ");
        int num = 0;
        int t = s.nextInt();
        for (int v = 1; v <= (t/2); v++) { //extracting divisors
            if (t % v == 0) {
                System.out.print("Divisor is " + v + " ");
                num += v; //extracting sum of divisors
            }
        }
        System.out.println();
//        System.out.println(sum+" ");
        System.out.println(num==1? "prime":"not prime");


//method3
//finding divisors other than 1 and the given no.
        Scanner neu = new Scanner(System.in);
        System.out.print("Enter number: ");
        int q = neu.nextInt();
        boolean isPrime = true; //this checks if for block is not executed
        for (int m=2;m<q;m++){
            if(q%m==0) {
                isPrime= false; //checks if for box executed
                break;
            }
        }
        System.out.println(isPrime?"prime":"not prime");
    }
}

