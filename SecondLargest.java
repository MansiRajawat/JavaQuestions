package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        // largest = 5
        // secondLargest = 4
        int largest = 0;
        int secondLargest = 0;
        for(int i = 0; i< numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
            System.out.println(largest);
            for(int i =0; i < numbers.length; i++){
                if(numbers[i] > secondLargest && numbers[i] != largest){
                    secondLargest = numbers[i];
                }
            }
        System.out.println(secondLargest);
        }
    }
