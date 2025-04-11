package Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; //output {5,6,7,1,2,3,4}
        int k = 3;
        int n = arr.length;
        k = k % n;
        int[] rotatedarray = new int[n];
        int i = 0;
        while(i < n){
            rotatedarray[(i + k) % n] = arr[i];
            i++;
        }
        i=0;
        while(i < n){
            arr[i] = rotatedarray[i];
            i++;
        }
        for(int val : arr){
            System.out.println(val);
        }
    }
}
