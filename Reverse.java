package Arrays;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7};
        int i = 0;
        int j= arrays.length-1;
        int temp;
        while( i < j){
            temp= arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arrays));//
    }
}
