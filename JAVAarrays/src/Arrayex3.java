public class Arrayex3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,5,7};
        int i;
        int sum=0;
        int product =1;
        double average =0;
        for (i =0; i< numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
        average = (double) sum/i;
        System.out.println("sum: "+sum+" product: "+product+" Average: "+average);
    }
}
