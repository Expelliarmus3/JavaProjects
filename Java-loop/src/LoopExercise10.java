//checking for palindrome string

public class LoopExercise10 {
    public static void main(String[] args) {
        String t = "Heho";
        String reverse="";
        for (int m = t.length()-1;m>=0;m--)
            reverse += t.charAt(m);
        System.out.println(reverse.equals(t) ?"Palindrome":"Not palindrome");
    }
}
