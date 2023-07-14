package Strings;

public class reverseStringWithoutInbuildMethod {
    /**
     * Given an string str, reverse it without using any inbuilt method
     */

    public static String reverseWRecursion(String str){
        if(str.isBlank() || str.length()==1){
            return str;
        }
        else {
            return reverseWRecursion(str.substring(1))+str.charAt(0);
        }
    }

    public static void main(String [] args){
        String str = "my name is cody";
        System.out.println(reverseWRecursion(str));
    }
}
