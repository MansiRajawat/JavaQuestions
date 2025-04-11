package Arrays;

public class MergeArray {
    public static void main(String[] args) {
         int[] originalArray = {1,2,3,4,5};
         int[] newArray = {6,7,8,9};
         int[] numbers = new int[originalArray.length+ newArray.length];
         for(int i =0; i < originalArray.length; i++){
             numbers[i] = originalArray[i];
         }
         int length = numbers.length - originalArray.length;
         for(int i =0; i < newArray.length; i++){
             numbers[length+1] = newArray[i];
             length++;
         }
         for(int val : numbers){
             System.out.println(val);
         }
    }
}
