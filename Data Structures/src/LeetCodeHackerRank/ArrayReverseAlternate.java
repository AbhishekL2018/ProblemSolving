package LeetCodeHackerRank;

public class ArrayReverseAlternate {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        ArrayReverseAlternate.reverse(arr);
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(Integer i:arr){
            System.out.println(i);
        }
    }
}
