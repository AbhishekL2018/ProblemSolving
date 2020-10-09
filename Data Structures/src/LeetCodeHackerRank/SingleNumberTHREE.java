package LeetCodeHackerRank;

public class SingleNumberTHREE {
    public static void main(String[] args) {
        int[] result = SingleNumberTHREE.singleNumber(new int[]{1,2,1,3,2,5});
        for(Integer i:result){
            System.out.println(i);
        }
    }
    public static int[] singleNumber(int[] nums) {
        int xy = 0;
        for(int n: nums) xy ^= n;
        xy &= -xy;
        int[] result = new int[2];
        for(int n: nums){
            if((xy & n) == 0) result[0] ^= n;
            else result[1] ^= n;
        }
        return result;
    }
}
