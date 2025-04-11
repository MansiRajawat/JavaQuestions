package Arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int target = 4;
        boolean exists = false; // Assume that the element is not present in the Above Array
        for(int i =0; i < numbers.length; i++){
           if(numbers[i] == target){
               exists = true;
               break;
           }
        }
        if(exists){
            System.out.println("The given element is present"+" "+ target);
        }
        else{
            System.out.println("The given element is not present"+" "+ target);
        }
    }
}
