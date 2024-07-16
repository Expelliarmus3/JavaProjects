package Practice;

public class Main {
    public static void main(String[] args) {
        //problem1
        String s = "hello world";
        System.out.println(s.toUpperCase());

        //problem2
        System.out.println(s.replace(' ','_'));

        //problem3
        String text = "dear <|name|>, thanks a lot!";
        System.out.println(text.replace("<|name|>","Ahana"));

        //problem4
        String text2 ="hello hi  bye   bye again";
        System.out.println(text2.indexOf("  "));
        System.out.println(text2.indexOf("   "));

        //problem5
        String letter= "Dear Ahana,\n\tThanks for practising.\n\tBye";
        System.out.println(letter);

    }
}
