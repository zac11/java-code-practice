package Arrays;

import java.util.HashSet;
import java.util.Set;

public class printDuplicatesInArray {
    /**
     * Given an array arr, print the elements that occur more than once.
     */

    public static void findDuplicates(int [] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate element found --> "+arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }

    public static void main(String [] args){
        int [] arr = {1,2,3,5,6,8,9,2,1,4,7,4};
        findDuplicates(arr);
    }
}
