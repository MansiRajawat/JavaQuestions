package Arrays;

public class Min{
    public static void main(String[] args) {
        int[] numbers = {5,6,8,4,4};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
