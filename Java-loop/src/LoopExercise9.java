//print reverse of a string

public class LoopExercise9 {
    public static void main(String[] args) {
        String s = "This is a text";
        for (int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();

//UPDATE
        String t = "Hello";
        String reverse="";
        for (int m = t.length()-1;m>=0;m--)
            reverse += t.charAt(m);
        System.out.println(reverse);


    }
}
