package LeetCodeHackerRank;

public class CountTotalNegativeSubArraySum {
    public static void main(String[] args) {
        System.out.println(
                CountTotalNegativeSubArraySum.longestSumContiguousSubArray(
                        new int[] {-2,-3,4,-1,-2}
                ));

        System.out.println(
                CountTotalNegativeSubArraySum.longestSumContiguousSubArray(
                        new int[] {10,20,35,40,10,-10,100,-50}
                ));
    }

    private static int longestSumContiguousSubArray(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int max_ending_here = 0;
            for(int j=i; j<arr.length; j++){
                max_ending_here = max_ending_here+arr[j];
                if(max_ending_here<0){
                    count++;
                }
            }
        }
        return count;
    }
}
