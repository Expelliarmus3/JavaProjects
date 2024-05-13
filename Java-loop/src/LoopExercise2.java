import java.util.Scanner;

//Reading a sequence of integers from user and stopping when sum exceeds 100

public class LoopExercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i<=100) {
            System.out.print("Enter your number: ");
            i += s.nextInt();
        }
        System.out.println("Done");

        int j;
        for (j=0;j<=100;j+=s.nextInt()) {
            System.out.print("Enter your num: ");
        }
        System.out.println("Done 2");


//using infinite loop
        int sum =0;
        while(true) {
            System.out.print("Enter your number: ");
            sum += s.nextInt();

            if(sum>100)
                break;
        }
        System.out.println("Done "+sum);






    }
}
