package Strings;

import java.util.HashMap;
import java.util.Map;

public class countOccurancesofCharacters {
    /**
     * Given a string str, print the occurances of all characters
     */

    public static void countOccurances(String str){
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(mp.containsKey(c)){
                int count = mp.get(c);
                mp.put(c, count+1);
            }
            else {
                mp.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry :mp.entrySet()){
            System.out.println("Character "+entry.getKey()+" occurs "+entry.getValue()+" times");
        }
    }

    public static void main(String [] args){
        String str = "This is epam questions";
        countOccurances(str);
    }
}
