import java.util.Arrays;

public class Arrayex6 {
    public static void main(String[] args) {
        int[] num= {1,2,4,5,7,9,-2,3};
        int[] temp = new int[num.length];
        int j=0;
        int k= temp.length-1;
        for (int i=0; i< num.length;i++){
            if (num[i]%2!=0){
                temp[j]= num[i];
                j++;
            }
            if (num[i]%2==0){
                temp[k]=num[i];
                k--;
            }
        }
        System.out.println(Arrays.toString(temp));
        copyArray(temp, num);
    }

    private static void copyArray(int[] temp, int[] num) {
        for (int i=0; i< temp.length;i++)
            num[i]=temp[i];
        System.out.println(Arrays.toString(num));
    }
}
