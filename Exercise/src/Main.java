import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double count=0;
//        System.out.println("Enter marks for subject 1: ");
//        System.out.println("Enter marks for subject 2: ");
//        System.out.println("Enter marks for subject 3: ");
//        System.out.println("Enter marks for subject 4: ");
//        System.out.println("Enter marks for subject 5: ");
        for (int i=0;i<5;i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": (marks out of 100) ");
            double m= input.nextInt();
            count+=m;
        }
        System.out.println("The percentage achieved is: "+(count/500)*100);
    }
}