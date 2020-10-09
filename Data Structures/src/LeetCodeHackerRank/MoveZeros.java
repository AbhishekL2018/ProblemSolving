package LeetCodeHackerRank;

public class MoveZeros {
    public static void main(String[] args) {
        int[] result = MoveZeros.reArrange(new int[]{0,0,1,0,3,4,0,12});
        for(Integer i:result){
            System.out.println(i);
        }
    }
    public static int[] reArrange(int[] nums){
        int left = 0;
        int right = 0;
        int temp = 0;
        while(right<nums.length){
            if(nums[right]==0){
                right++;
            }else{
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                left++;
            }
        }
        return nums;
    }
}
