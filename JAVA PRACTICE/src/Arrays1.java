import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elments?(max 20): ");
        int n = s.nextInt();
        int[] numbers = new int[n];
        
        for (int i=1;i< numbers.length;i++){
            numbers[i]=n;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
