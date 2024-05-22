public class Arrayex4contd {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,3,4};
        int searchElement = 1;
        System.out.println(occ(numbers,searchElement));

    }

    public static int occ(int[] numbers , int searchElement) {
        int occ=0;
        for (int i =0; i< numbers.length;i++)
            if (numbers[i]==searchElement) {
                occ++;
            }
        return occ;

    }
}
