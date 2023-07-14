package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class countUniqueElementsinArray {
    /**
     * Given an array arr, print only the unique entries
     */

    public static void printUniques(int [] arr){
        Set<Integer> set = new LinkedHashSet<>();

        // add elements to set
        for(int i : arr){
            set.add(i);
        }

        for(Integer i : set){
            System.out.println(i);
        }
    }

    public static void main(String [] args){
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        printUniques(arr);
    }


}
