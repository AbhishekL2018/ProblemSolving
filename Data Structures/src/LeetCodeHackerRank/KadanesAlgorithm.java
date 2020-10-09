package LeetCodeHackerRank;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        System.out.println(
                KadanesAlgorithm.longestSumContiguousSubArray(
                new int[] {-2,-3,4,-1,-2,1,5,-3}
        ));

        System.out.println(
                KadanesAlgorithm.longestSumContiguousSubArray(
                        new int[] {10,20,35,40,10,-10,100,-50}
                ));
    }
    public static int longestSumContiguousSubArray(int[] arr){
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            //max_ending_here = max_ending_here+arr[i];
            /*if(max_ending_here<arr[i]){
                max_ending_here = arr[i];
            }*/
            max_ending_here = Math.max(max_ending_here+arr[i], arr[i]);
            /*if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }*/
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
