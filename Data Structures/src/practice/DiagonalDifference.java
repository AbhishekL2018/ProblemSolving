package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        char c = 'c';
        int index =  c - 'a';
        System.out.println(index);
    }

    private static int diagonalDifference(List<List<Integer>> arr) {
        int right = 0;
        int left = 0;
        for(int i=0; i<arr.size(); i++){
                left += arr.get(i).get(i);
                right += arr.get(i).get(arr.size()-1-i);
            }
        return Math.abs(left-right);
    }
}
