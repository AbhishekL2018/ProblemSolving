package LeetCodeHackerRank;

import java.util.Arrays;

public class SingleNumberTWO {
    public static void main(String[] args) {
        System.out.println(SingleNumberTWO.singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
    public static int singleNumber(int[] nums) {
        int left = 1;
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[len-1]!=nums[len-2]){
            return nums[len-1];
        }
        while(left<len){
            if(nums[left]!=nums[left-1]){
                return nums[left-1];
            }
                left += 3;
        }
        return 0;
    }
}
