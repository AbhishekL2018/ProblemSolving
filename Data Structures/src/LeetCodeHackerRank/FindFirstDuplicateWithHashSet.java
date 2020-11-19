package LeetCodeHackerRank;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateWithHashSet {
    public static void main(String[] args) {
        System.out.println(FindFirstDuplicateWithHashSet.findFirstDuplicate(
                new int[]{2,1,3,5,3,2}
        ));
        System.out.println(FindFirstDuplicateWithHashSet.findFirstDuplicate(
                new int[]{2,1,2,1,3,3}
        ));
    }
    public static int findFirstDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
}
