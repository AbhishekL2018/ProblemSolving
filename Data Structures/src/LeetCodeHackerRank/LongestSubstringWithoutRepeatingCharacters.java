package LeetCodeHackerRank;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(
                LongestSubstringWithoutRepeatingCharacters.
                        lengthOfLongestSubString("PWWKEW"));

        System.out.println(
                LongestSubstringWithoutRepeatingCharacters.
                        lengthOfLongestSubString("abadbccdb"));
    }
    public static int lengthOfLongestSubString(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        int start = 0;
        int end = 0;
        int length = 0;
        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        while(end<s.length()){
            char c = s.charAt(end);
            if(!set.contains(c)){
                set.add(c);
                length = end-start+1;
                max = Math.max(max,length);
                end++;
            }else{
                while(set.contains(c) && start<=end){
                    set.remove(s.charAt(start));
                    start++;
                }
            }
        }
        return max;
    }
}
