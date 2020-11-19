package LeetCodeHackerRank;

public class FirstAndLastIndexPosition {
    public static void main(String[] args) {
        int[] indeces = FirstAndLastIndexPosition.searchRange(new int[]{5,7,8,8,8,8,8,10},8);
        for(Integer i:indeces){
            System.out.println(i);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] indeces = new int[2];
        indeces[0] = firstIndex(nums,target);
        indeces[1] = lastIndex(nums,target);
        return indeces;
    }
    public static int firstIndex(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                index = mid;
                right = mid - 1;
            }else if(nums[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return index;
    }
    public static int lastIndex(int[] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                index = mid;
                left = mid + 1;
            }else if(nums[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return index;
    }
}
