package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivisibleByKCount {
    public static void main(String[] args) {
        System.out.println(SubArraySumDivisibleByKCount.giveCount(
                new int[]{2,3,5,4,5,3,4}, 7
        ));
        System.out.println(SubArraySumDivisibleByKCount.giveCount(
                new int[]{2,-6,3,1,2,8,2,1}, 7
        ));
    }

    private static int giveCount(int[] A, int k){
        int count = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<A.length; i++){
            sum += A[i];
            int rem = (sum%k);
            if(rem<0){
                rem += k;
            }
            if(map.containsKey(rem)){
                count = count+map.get(rem);
                map.put(rem, map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }
        return count;
    }
}
