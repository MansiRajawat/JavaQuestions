package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int index = 3;
        int target = 4;
        int[] newArray = new int[originalArray.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = originalArray[i];
        }
        for (int i = index; i < originalArray.length-1; i++) {
            newArray[i] = originalArray[i + 1];
        }
        for (int i : newArray) {
            System.out.println(i);
        }
    }
}
