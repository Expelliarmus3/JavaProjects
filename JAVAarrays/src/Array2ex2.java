public class Array2ex2 {
    public static void main(String[] args) {
        int[][] integers= {
                {1,10,74,8},
                {9,15,6,7},
                {5,99,11,4}
        };
        int max=0;
        for (int i=0;i<3;i++) {
            max=0;
            for (int j = 0; j < 4; j++)
                max = integers[i][j] > max ? integers[i][j] : max;
            System.out.println("max of row"+(i+1)+": "+max);
        }
    }
}
