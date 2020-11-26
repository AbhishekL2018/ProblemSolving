package LeetCodeHackerRank;

public class FindLongestSubarrayBySum {
    public static void main(String[] args) {
        int[] result = FindLongestSubarrayBySum.findLongestSubArrayBySUm(
                new int[]{1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10}, 15
        );
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] findLongestSubArrayBySUm(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int gap = 0;
        int sum = nums[right];
        int[] result = new int[2];
        while (right < nums.length-1) {
            if (sum < k) {
                right++;
                sum += nums[right];
            }
            if (sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                if (((right + 1) - (left + 1) > gap)) {
                    gap = (right + 1) - (left + 1);
                    result[0] = left + 1;
                    result[1] = right + 1;
                }
                right++;
                sum += nums[right];
            }
        }
        return result;
    }
}
