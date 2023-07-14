package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeVowelsFromAString {
    /**
     * Given a string str, print the str without the vowels
     */

    public static String removeVowelsApproach1(String str){
        StringBuilder finalString  = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for(char c : str.toCharArray()){
            if(vowels.indexOf(c)==-1){
                finalString.append(c);
            }
        }
        return finalString.toString();
    }

    public static String removeVowelsApproach2(String str){
        String vowelRegex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(vowelRegex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }

    public static String removeVowelsApproach3(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
                if(!isVowel(c)){
                    sb.append(c);
                }
        }

        return sb.toString();
    }

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c =='a' ||c == 'e' || c =='i' || c == 'o' || c == 'u');
    }

    public static void main(String [] args){
        String str = "my name is eminem";
        System.out.println(removeVowelsApproach1(str));
        System.out.println(removeVowelsApproach2(str));
        System.out.println(removeVowelsApproach3(str));
    }


}
