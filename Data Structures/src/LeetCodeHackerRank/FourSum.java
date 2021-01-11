package LeetCodeHackerRank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        List<List<Integer>> result = fourSum(new int[]{4,3,3,4,4,2,1,2,1,1},9);
        System.out.println(result);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target){

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(nums==null || nums.length == 0){
            return result;
        }

        Arrays.sort(nums);
        int len = nums.length;

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                int right = len-1;
                int left = j+1;
                int sum = target-nums[i]-nums[j];
                while(left<right){
                    if(nums[left]+nums[right]<sum){
                        left++;
                    }else if(nums[left]+nums[right]>sum){
                        right--;
                    }else{
                        List<Integer> subResultSet = new ArrayList<Integer>();
                        subResultSet.add(nums[i]);
                        subResultSet.add(nums[j]);
                        subResultSet.add(nums[left]);
                        subResultSet.add(nums[right]);
                        result.add(subResultSet);

                        while(left<right && nums[left] == subResultSet.get(2)){
                            left++;
                        }

                        while(left<right && nums[right] == subResultSet.get(3)){
                            right--;
                        }
                    }
                }
                while(j+1 < len && nums[j+1] == nums[j]){
                    j++;
                }
            }
            while(i+1 < len && nums[i+1] == nums[i]){
                i++;
            }
        }
        return result;
    }
}
