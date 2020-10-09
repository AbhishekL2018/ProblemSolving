package LeetCodeHackerRank;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5,7,8,9};
        System.out.println(BinarySearchAlgorithm.returnIndex(0,arr.length-1,8,arr));
    }
    public static int returnIndex(int low, int high, int target, int[] arr){
        if(low>high){
            return -1;
        }
        int index = -1;
        int mid = low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            index = returnIndex(mid+1,high,target,arr);
        }else{
            index = returnIndex(low,mid-1,target,arr);
        }
        return index;
    }
}
