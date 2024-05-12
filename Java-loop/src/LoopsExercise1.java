//printing even no.s in increasing and decreasing order

//using for loop
public class LoopsExercise1 {
    public static void main(String[] args) {
        int i;
        for(i=2;i>1 && i<=100 && (i%2==0);i++) { //increasing
            System.out.print((i++) + " ");
        }
        System.out.println();
        for(i=100;i>1 && i<=100 && (i%2==0);i--) { //decreasing
            System.out.print((i--) + " ");
        }
        System.out.println();

//another way
        for (i=1;i<=100;i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        for (i=1;i<=100;i+=2) { //another logic
            System.out.print(i + " ");
        }
        System.out.println();

        for (i=100;i>=1;i-=2) { //another logic
            System.out.print(i + " ");
        }
        System.out.println();

        for (i=100;i>=1;i--) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();


//using while loop
        int j=1;
        while ( j<=100 ) { //increasing
            if (j%2==0)
                System.out.print(j+" ");
            j++;
        }
        System.out.println();

        int t =100;
        while (t >=1 ) { //decreasing
            if (t%2==0)
                System.out.print(t+" ");
            t--;
        }
        System.out.println();

//using doWhile loop

        int q=1;
        do {
            System.out.print(q+" "); //increasing
            q++;
        }while (q<=100);
        System.out.println();

        q=100;
        do {
            System.out.print(q+" "); //decreasing
            q--;
        }while (q>=1);

    }
}
