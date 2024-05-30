import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylistex1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers= new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int i=0;
        System.out.print("Enter 5 integers: ");
        while (i<5) {
            int t = s.nextInt();
            if (!(integers.contains(t))) {
                integers.add(t);
            }
            i++;
        }
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
    }
}
