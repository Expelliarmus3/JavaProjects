//making patterns

import java.util.Scanner;

public class LoopExercise12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int n = s.nextInt();
//pattern 1
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
//pattern 2
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }

//pattern 3
        int z= 0;
        while (z<=3) {
            for (int i =1; i<=n;i++){

                for (int j=1;j<=n-i;j++)
                    System.out.print(" ");
                for (int k=1;k<=2*i-1;k++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            z++;
        }
    }

}
