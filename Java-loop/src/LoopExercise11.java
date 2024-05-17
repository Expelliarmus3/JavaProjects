//making patterns

import java.util.Scanner;

public class LoopExercise11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int n = s.nextInt();
        for (int i =1; i<=n;i++){
//            System.out.println(i);
            for (int j=1;j<=i;j++)
                System.out.print(i);
            System.out.println();

        }

    }
}
