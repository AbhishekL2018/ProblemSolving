package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    //O(n) ----> linear time complexity

    public static int diagonalDifference(List<List<Integer>> arr){
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for(int i=0; i<arr.size(); i++){
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(arr.size()-i-1);
        }
        return Math.abs(leftDiagonal-rightDiagonal);
    }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(9,8,9);
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        System.out.println(DiagonalDifference.diagonalDifference(arr));
    }
}
