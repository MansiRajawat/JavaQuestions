package Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] originalArray = {1,2,3,4,5,6};
        int index = 3;
        int target = 12;
        int[] newArray = new int[originalArray.length + 1];
        for(int i = 0; i < index; i++){
            newArray[i] = originalArray[i];
        }
        newArray[index] = target;
        for(int i = index; i < originalArray.length; i++){
            newArray[i+1] = originalArray[i];
        }
        for(int i : newArray){
            System.out.println(i);
        }
    }
}
