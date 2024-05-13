//reads a sequence and stops at negative input and displays max and min value

import java.util.Scanner;

public class LoopExercise5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i=s.nextInt();
        int max=i;
        int min=i;
        if(i>=0) {
            do {
                i = s.nextInt();
                if (i < 0)
                    break;
//                if (max < i)
//                    max = i;
//                if (min > i)
//                    min = i;
                max= i>max? i:max; //conditional operator
                min= i<min? i:min;
            } while (true);
            System.out.println("max: " + max + " min: " + min);
        }
        else
            System.out.println(i+" is invalid");
    }
}
