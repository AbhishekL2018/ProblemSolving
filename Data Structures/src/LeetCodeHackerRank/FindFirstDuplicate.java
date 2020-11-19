package LeetCodeHackerRank;

//O(N) && O(1)
//No extra space && linear time

public class FindFirstDuplicate {
    public static void main(String[] args) {
        System.out.println(FindFirstDuplicate.findFirstDuplicate(
                new int[]{2,1,3,5,3,2}
        ));
        System.out.println(FindFirstDuplicate.findFirstDuplicate(
                new int[]{2,1,2,1,3,3}
        ));
    }
    public static int findFirstDuplicate(int[] nums){
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                return Math.abs(nums[i]);
            }
            nums[index] = -nums[index];
        }
        return -1;
    }
}
