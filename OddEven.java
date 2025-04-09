package Arrays;

public class OddEven {
    public static void main(String[] args) {

        // Count Even And ODD numbers in an array
        int[] numbers = {2, 4, 3, 5, 7, 8, 9, 4, 6};
        int evencount = 0;
        int oddcount = 0;
        for (int i =0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println("Even Numbers :" + evencount);
        System.out.println("Odd Number :"+ oddcount);
    }
}
