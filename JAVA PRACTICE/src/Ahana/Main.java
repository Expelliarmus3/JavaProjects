package Ahana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        Scanner s = new Scanner(System.in);
        for (int i=0; i< rectangles.length;i++){
            System.out.println("Do you want to add height and width? (y/n)");

            char choice = s.next().charAt(0);
            if (choice=='y') {
                System.out.println("enter width and height: ");
                rectangles[i] = new Rectangle(s.nextDouble(),s.nextDouble());
            }
            else
                rectangles[i]=new Rectangle();
        }
        System.out.println("The rectangles are:");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle "+(i+1)+
                    " width: "+rectangles[i].getWidth()+" height: "+rectangles[i].getHeight());
        }
    }




}
