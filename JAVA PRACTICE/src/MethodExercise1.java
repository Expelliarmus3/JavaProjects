import java.util.Scanner;

public class MethodExercise1 {
    public static void main(String[] args) {
        System.out.print("Enter your name and age: ");
        System.out.println(getUserName()+" "+getUserAge());
    }
    public static String getUserName() {
        Scanner s=new Scanner(System.in);
        return s.nextLine();
    }
    public static int getUserAge() {
        Scanner s=new Scanner(System.in);
        return  s.nextInt();


    }
}
