package LeetCodeHackerRank;

public class SortedSquareArray {
    public static void main(String[] args) {
        int[] result = sortedSquareArray(new int[]{-6,-4,1,2,3,5});
        for(Integer i:result){
            System.out.print(i+" ");
        }
    }
    public static int[] sortedSquareArray(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = result.length-1;
        for(int i=result.length-1; i>=0; i--){
            if(Math.abs(arr[left])>arr[right]){
                result[i] = arr[left]*arr[left];
                left++;
            }else{
                result[i] = arr[right]*arr[right];
                right--;
            }
        }
        return result;
    }
}
