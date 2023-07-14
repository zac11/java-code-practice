package Arrays;

public class sumofAllElements {
    /**
     * Given an array arr, print the sum of all elements
     */

    public static int returnSumOfElements(int [] arr){
        int sum = 0;
        for (int i : arr){
           sum+=i;
        }

        return sum;
    }

    public static void main(String [] args){
        int [] arr = {1,4,6,7,9,2};
        System.out.println(returnSumOfElements(arr));
    }
}
