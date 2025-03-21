package Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] originalArray = {1,2,3,4,5,6};
        int add = 7;
        int[] newArray = new int[originalArray.length+ 1];
        for (int i = 0; i < originalArray.length; i++){
            newArray[i] = originalArray[i];
            newArray[newArray.length - 1] = 7;
        }
        for (int i : newArray){
            System.out.println(i);
        }
    }
}
