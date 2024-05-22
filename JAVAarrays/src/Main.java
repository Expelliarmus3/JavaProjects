import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many number?(max 20): ");
        int n = s.nextInt();
        while (n>20||n<=0) {
            System.out.println("Invalid input. Try again: ");
            n= s.nextInt();
        }
        int[] numbers = new int[n];
        fillArray(numbers);
        printArray(numbers);
    }

    private static void fillArray(int[] numbers) {
        for (int i=0; i< numbers.length; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("enter numbers"+(i+1)+" : ");
            numbers[i]= input.nextInt();
        }
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}