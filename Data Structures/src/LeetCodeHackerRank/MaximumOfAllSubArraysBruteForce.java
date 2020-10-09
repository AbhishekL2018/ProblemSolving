package LeetCodeHackerRank;

public class MaximumOfAllSubArraysBruteForce {
    public static void main(String[] args) {
        int[] arr = MaximumOfAllSubArraysBruteForce.getMaxSumOfAllSubarray(
                new int[]{9,-6,0,10,5,8,-10,15}, 3
        );
        for(Integer i:arr){
            System.out.println(i);
        }
    }

    private static int[] getMaxSumOfAllSubarray(int[] arr, int k) {
        int[] result = new int[arr.length-k+1];
        for(int i=0; i<arr.length-k+1; i++){
            int max = arr[i];
            for(int j=i; j<i+k; j++){
                max = Math.max(arr[j],max);
            }
            result[i] = max;
        }
        return result;
    }
}
