package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterString {
    public static void main(String[] args) {
        //System.out.println(firstNonRepeatingCharacter("aabbbcdeceef"));
        //System.out.println(firstNonRepeatingCharacter("aabcbbdd"));
        //System.out.println(alternateFirstNonRepeatingCharacter("aabcbbdd"));
        System.out.println(alternateFirstNonRepeatingCharacter("aabbbcdeceef"));
    }
    public static char firstNonRepeatingCharacter(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c)==1){
                return c;
            }
        }
        return '_';
    }

    public static char alternateFirstNonRepeatingCharacter(String s){
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            arr[c-'a'] += 1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                return (char)(i+(int)'a');
            }
        }
        return '_';
    }
}
