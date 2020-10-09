package LeetCodeHackerRank;

public class NoKadanceLongestSumContiguousSubArray {
    public static void main(String[] args) {
        System.out.println(
                NoKadanceLongestSumContiguousSubArray.longestSumContiguousSubArray(
                        new int[]{-2, -3, 4, -1, -2, 1, 5, -3}
                ));

        System.out.println(
                NoKadanceLongestSumContiguousSubArray.longestSumContiguousSubArray(
                        new int[]{10, 20, 35, 40, 10, -10, 100, -50}
                ));
    }

    public static int longestSumContiguousSubArray(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum>max_sum){
                    max_sum = sum;
                }
            }
        }
        return max_sum;
    }
}
