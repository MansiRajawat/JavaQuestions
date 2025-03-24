package Arrays;

public class Occurence {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 3, 3, 4, 4, 5, 6};
        int target = 3;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {  // Check if the current element is equal to the target
                count++;
            }
        }
        System.out.println(count);
    }
}