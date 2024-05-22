import java.util.Scanner;

public class Arrayex4 {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,3,4};
        Scanner s = new Scanner(System.in);
        System.out.print("enter your number: ");
        int n= s.nextInt();
        int occ=0;
        int x;
        int y;
        for (x=0; x<num.length;x++) {
            if (num[x]==n){
                occ += 1;


            }
        }
        System.out.println("The occurrence of "+n+" is "+occ);
    }
}
