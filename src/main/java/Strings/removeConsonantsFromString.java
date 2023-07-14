package Strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class removeConsonantsFromString {
    /**
     * Given a string str, remove all the consonants from it
     */

    public static void removeConsonants(String str){
        String wo_consonants = Pattern.compile("[aeiouAEIOU\\\\w\\\\d]")
                .matcher(str)
                .results()
                .map(match -> match.group())
                .collect(Collectors.joining());

        System.out.println("String without consonants -->"+wo_consonants);
    }

    public static void main(String [] args){
        String str = "java is a programming language";
        removeConsonants(str);
    }
}
