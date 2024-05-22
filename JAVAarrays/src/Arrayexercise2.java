import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayexercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many number?(max 20): ");
        int n = s.nextInt();
        while (n>20||n<=0) {
            System.out.println("Invalid input. Try again: ");
            n= s.nextInt();
        }
        Point[] points = new Point[n];
        fillArray(points);
        printArray(points);

    }

    private static void fillArray(Point[] points) {
        for (int i=0; i< points.length; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter x and y for point"+(i+1)+" : ");
            points[i]= new Point(input.nextInt(),input.nextInt());
            }

    }

    private static void printArray(Point[] points) {
        for (int i =0; i< points.length;i++){
            System.out.print("("+points[i].x+", "+points[i].y+")");
        }
    }


}
