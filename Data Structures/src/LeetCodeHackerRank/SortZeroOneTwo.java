package LeetCodeHackerRank;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] result = SortZeroOneTwo.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        for (Integer i : result) {
            System.out.println(i);
        }
    }

    public static int[] sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= right) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[left];
                    nums[left] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    left++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[right];
                    nums[right] = temp;
                    right--;
                    break;
                }

            }

        }
        return nums;
    }
}
