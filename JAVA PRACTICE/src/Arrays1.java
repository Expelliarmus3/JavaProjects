import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("How many number?(max 20): ");
        int n = s.nextInt();
        while(n<=0||n>20){
            System.out.println("Invalid input! Try again: ");
            n= s.nextInt();
        }
        int[] numbers = new int[n];
        fillArray(numbers);
        printArray(numbers);
    }

    private static void fillArray(int[] numbers) {
        for (int i=0;i< numbers.length;i++){
            Scanner input= new Scanner(System.in);
            System.out.println("Enter your number: ");
            numbers[i]= input.nextInt();
        }
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
