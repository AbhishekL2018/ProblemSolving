package LeetCodeHackerRank;

//to caculate sum of a range of a given array in the most efficient way

public class PrefixSumAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,-4,5,0,3,-2,7}; //array of size 8
        arr = PrefixSumAlgorithm.sumArrayElements(arr);

        //print newly evaluated array
        /*for(Integer i:arr){
            System.out.println(i);
        }*/

        //to calculate the sum of array [0,arrayLength-1]
        System.out.println(arr[arr.length-1]); //index 7
        //to calculate sum from index range [0,4]
        System.out.println(arr[4]);
        //to calculate sum from index range [0,6]
        System.out.println(arr[6]);
        //to calculate sum from index range [3,6] --> start=3, end=6
        int start=3;
        int end=6;
        System.out.println(arr[end]-arr[start-1]);
    }
    public static int[] sumArrayElements(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }
}
