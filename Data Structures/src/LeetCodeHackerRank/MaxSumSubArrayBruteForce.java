package LeetCodeHackerRank;

public class MaxSumSubArrayBruteForce {
    public static void main(String[] args) {
        System.out.println(MaxSumSubArrayBruteForce.getMaxSumSubarray(
                new int[]{9,-6,0,10,5,8,-10,15}, 3
        ));
    }

    private static int getMaxSumSubarray(int[] ints,int k) {
        int maxSum = 0;
        for(int i=0; i<ints.length-k+1; i++){
            int windowSum = 0;
            for(int j=i; j<i+k; j++){
                windowSum += ints[j];
            }
            maxSum= Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}
