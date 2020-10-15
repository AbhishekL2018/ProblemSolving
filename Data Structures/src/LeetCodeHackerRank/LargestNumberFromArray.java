package LeetCodeHackerRank;

import java.util.Arrays;

public class LargestNumberFromArray {
    public static void main(String[] args) {
        System.out.println(LargestNumberFromArray.largestNumber(
                new int[]{3,30,34,5,9}
        ));
        System.out.println(LargestNumberFromArray.largestNumber(
                new int[]{10,2}
        ));
        System.out.println(LargestNumberFromArray.largestNumber(
                new int[]{2}
        ));
        System.out.println(LargestNumberFromArray.largestNumber(
                new int[]{999999998,999999997,999999999}
        ));
        System.out.println(LargestNumberFromArray.largestNumber(
                new int[]{0,0}
        ));
    }

    public static String largestNumber(int[] nums) {
        String result = Arrays.stream(nums).mapToObj(String::valueOf).sorted((a, b) -> (b + a).compareTo(a + b)).reduce((a, b) -> a + b).get();
        return result.startsWith("0") ? "0" : result;
    }
}
