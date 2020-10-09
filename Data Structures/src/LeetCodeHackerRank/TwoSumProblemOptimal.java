package LeetCodeHackerRank;

import java.util.*;

public class TwoSumProblemOptimal {
    public static void main(String[] args) {
        int[] result = TwoSumProblemOptimal.giveIndeces(new int[]{2,6,5,8,11},14);
        List resultList= Arrays.asList(result);
        System.out.println(resultList);
    }
    public static int[] giveIndeces(int[] numbers, int target){
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                arr[0] = map.get(target-numbers[i]);
                arr[1] = i;
            }
            map.put(numbers[i],i);
        }
        return arr;
    }
}
