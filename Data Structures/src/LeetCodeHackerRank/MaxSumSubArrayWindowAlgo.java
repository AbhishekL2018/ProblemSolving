package LeetCodeHackerRank;

public class MaxSumSubArrayWindowAlgo {
    public static void main(String[] args) {
        System.out.println(MaxSumSubArrayWindowAlgo.getMaxSumSubarray(
                new int[]{9,-6,0,10,5,8,-10,15}, 3
        ));
    }

    private static int getMaxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        for(int j=k; j<arr.length; j++){
            windowSum = windowSum+arr[j]-arr[j-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
