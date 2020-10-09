package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(LongestConsecutiveSequence.longestConsecutive(new int[]{10,5,9,1,11,8,6,15,3,12,2}));
    }
    public static int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],true);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])){
                int startPoint = nums[i];
                int temporaryLength = 1;
                while(map.containsKey(startPoint+temporaryLength)){
                    temporaryLength++;
                }
                maxLength = Math.max(temporaryLength,maxLength);
            }
        }
        return maxLength;
    }
}
