package practice;

import LeetCodeHackerRank.SubArrayWithGivenSum;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSumIndex {
    public static void main(String[] args) {
        System.out.println(SubArrayWithGivenSumIndex.giveIndexPosition(new int[]{1,42,20,3,10,5},33));
        System.out.println(SubArrayWithGivenSumIndex.giveIndexPosition(new int[]{1,4,20,3,10,5},24));
        System.out.println(SubArrayWithGivenSumIndex.giveIndexPosition(new int[]{1,4,20,3,10,5},15));
    }
    public static List<Integer> giveIndexPosition(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int currentSum = arr[right];
        while(currentSum != k){
            if(currentSum<k){
                right++;
                currentSum += arr[right];
            }else {
                currentSum -= arr[left];
                left++;
            }
        }
        list.add(left);
        list.add(right);
        return list;
    }
}
