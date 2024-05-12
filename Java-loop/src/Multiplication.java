//creating a 10x10 multiplication table

public class Multiplication {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=1;i<=10;i++) { //the column-wise increment

            for (j = 1; j <= 10; j++) { //row-wise increment
                System.out.print(j * i + " ");

            }
            System.out.println(); //after end of nested loop this is executed
        /* this code is for making sure that i increases column-wise but does not
        print any extra character*/
        }
    }

}
