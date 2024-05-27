import java.util.Arrays;

public class Arrayex5 {
    public static void main(String[] args) {
        int[] num = {3,2,1,5,4};
        int max=num[0];
        int min=num[0];
        for (int i=1; i< num.length;i++){
            if (num[i]>max){
              max= num[i];
            }
            if (num[i]<min){
              min= num[i];
            }
        }
        System.out.println("max: "+max+" min: "+min);
        System.out.println();

//another way
        Arrays.sort(num);
        System.out.println("min: "+num[0]+" max: "+num[num.length-1]);
//https://spicychat.ai/chat/48b701c2-5055-4dd9-8fca-ed2dadbeb57a
    }
}
