package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumDivisibleByK {
    public static void main(String[] args) {
        System.out.println(LongestSubArrayWithSumDivisibleByK.getIndex(
                new int[]{2,4,8,1,7,3,6,1,9,2,7,3},5
        ));
    }
    private static int getIndex(int[] nums, int k){
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem<0){
                rem += k;
            }
            if(map.containsKey(rem)){
                count = Math.max(count, i-map.get(rem));
            }else{
                map.put(rem,i);
            }
        }
        return count;
    }
}
