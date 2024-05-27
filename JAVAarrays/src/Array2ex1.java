public class Array2ex1 {
    public static void main(String[] args) {
        int [][] integers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        printSumRows(integers);
        printSumColumns(integers);
    }

    private static void printSumColumns(int[][] integers) {
        for (int i = 0; i < 4; i++) {
            int sum = 0; //the position of this statement ensures that when we begin a new column the sum is 0
            for (int j=0;j< 3;j++){
                sum += integers[j][i];
            }
            System.out.println("sum of columns" + (i+1) + ": " + sum);
        }
    }

    private static void printSumRows(int[][] integers) {
        for (int i = 0; i < 3; i++) {
            int sum = 0; //the position of this statement ensures that when we begin a new row the sum is 0
            for (int j=0;j< 4;j++){
                sum += integers[i][j];
            }
            System.out.println("sum of rows" + (i+1) + ": " + sum);
        }
    }
}
