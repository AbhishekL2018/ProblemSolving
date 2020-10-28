package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.List;

public class FindLeadersInArray {
    public static void main(String[] args) {
        System.out.println(
                FindLeadersInArray.findLeadeers(new int[]{15, 18, 5, 3, 6, 2})
        );
    }

    public static List<Integer> findLeadeers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            max = Math.max(nums[i], max);
            if (!list.contains(max)) {
                list.add(max);
            }
        }
        return list;
    }
}
