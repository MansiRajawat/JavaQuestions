package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,8,9,3};
        int max =  numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max );
    }
}
