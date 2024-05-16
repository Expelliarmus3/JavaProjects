import java.util.Scanner;

//print string with space after each character
public class LoopExercise8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String n = s.nextLine();
        int t= n.length();
        for (int i=0;i<=(t-1);i++){
            System.out.print((n.charAt(i))+" ");
        }
    }
}
