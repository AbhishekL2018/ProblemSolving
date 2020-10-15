package LeetCodeHackerRank;

public class MaximumSumSubArrayKadanesAlgorithm {
    public static void main(String[] args) {
        System.out.println(
                MaximumSumSubArrayKadanesAlgorithm.longestSumContiguousSubArray(
                new int[] {-2,-3,4,-1,-2,1,5,-3}
        ));

        System.out.println(
                MaximumSumSubArrayKadanesAlgorithm.longestSumContiguousSubArray(
                        new int[] {10,20,35,40,10,-10,100,-50}
                ));
    }
    public static int longestSumContiguousSubArray(int[] nums){
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            //max_ending_here = max_ending_here+nums[i];
            /*if(max_ending_here<nums[i]){
                max_ending_here = nums[i];
            }*/
            max_ending_here = Math.max(max_ending_here+nums[i], nums[i]);
            /*if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }*/
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
