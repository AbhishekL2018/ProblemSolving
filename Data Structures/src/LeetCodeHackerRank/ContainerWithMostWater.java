package LeetCodeHackerRank;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,1}));
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,2,1}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int volume = 0;
        while(left<right){
            int distance = right-left;
            if(height[left]>height[right]){
                volume = Math.max(volume,distance*height[right]);
                right--;
            }else{
                volume = Math.max(volume,distance*height[left]);
                left++;
            }
        }
        return volume;
    }
}
