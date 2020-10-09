package LeetCodeHackerRank;


import java.util.ArrayList;
import java.util.List;

//should be solved in O(n) and constant time
//duplicates occurs twice
//1<=arr[i]<=n n=size of array

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        System.out.println(FindAllDuplicatesInArray.findDuplicates(
                new int[]{2,3,6,3,1,2}));
        //o/p : [3,2]
    }
    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                list.add(index+1);
            }else{
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}
