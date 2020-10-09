package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraySumsEqualsK {
    public static void main(String[] args) {
        System.out.println(NumberOfSubArraySumsEqualsK.subarraySum(new int[]{10, 5, 7, 1, 2, 5, 3}, 15));
        System.out.println(NumberOfSubArraySumsEqualsK.subarraySum(new int[]{-1, -1, 1}, 0));
        System.out.println(NumberOfSubArraySumsEqualsK.subarraySum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                count += map.get(nums[i] - k);
            }
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
