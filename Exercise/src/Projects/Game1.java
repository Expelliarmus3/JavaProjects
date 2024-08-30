package Projects;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Random rc = new Random();
        Scanner i = new Scanner(System.in);
        System.out.println("Game info...\n0=rock\n1=paper\n2=scissor");
        int count = 0;
        int comp_count=0;
        for (int t=0;t<3;t++) {

            System.out.print("Enter your digit: ");
            int hum = i.nextInt();
            System.out.println("Computer is choosing...");
            int comp = rc.nextInt(3);
            if (hum == comp)
                System.out.println("Draw");
            if (hum == 0 && comp == 1) {
                System.out.println("You lose\n You chose rock and computer chose paper");
                comp_count += 1;
            }
            if (hum == 0 && comp == 2) {
                System.out.println("You win\n You chose rock and the computer chose scissor");
                count += 1;
            }
            if (hum == 1 && comp == 0) {
                System.out.println("You win\n You chose paper and the computer chose rock");
                count += 1;
            }
            if (hum == 1 && comp == 2) {
                System.out.println("You lose\n You chose paper and the computer chose scissor");
                comp_count += 1;
            }
            if (hum == 2 && comp == 0) {
                System.out.println("You lose\n You chose scissor and the computer chose rock");
                comp_count += 1;
            }
            if (hum == 2 && comp == 1) {
                System.out.println("You win\n You chose scissor and the computer chose paper");
                count+=1;
            }
        }
        if (count>comp_count)
            System.out.println("You won the match");
        else if (count==comp_count)
            System.out.println("The match is draw");
        else
            System.out.println("Computer won the match");



    }
}
