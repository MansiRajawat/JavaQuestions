package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,4,5,6,8};
        int target = 11;
        for(int i = 0; i < num.length; i++){
            for(int j = i +1; j < num.length; j++){
                if(num[i] + num[j] == target){
                    System.out.println(i + " "+ j);
                }
            }
        }
    }
}
