package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println(SubArrayWithGivenSum.giveIndexPosition(new int[]{1,4,20,3,10,5},33));
        System.out.println(SubArrayWithGivenSum.giveIndexPosition(new int[]{1,4,20,3,10,5},24));
        System.out.println(SubArrayWithGivenSum.giveIndexPosition(new int[]{1,4,20,3,10,5},15));
    }
    public static List<Integer> giveIndexPosition(int[] arr, int k){
        List<Integer> indeces = new ArrayList<>();
        int sum = 0;
        int left = 0;
        int right = 0;
        while(sum != k){
            if(sum<k){
                sum += arr[right];
                right++;
            }else {
                sum -= arr[left];
                left++;
            }
        }
        indeces.add(left);
        indeces.add(right-1);
        return indeces;
    }
}
