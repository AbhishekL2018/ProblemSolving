package LeetCodeHackerRank;

//using prefix sum algorithm and modified it to perform multiplication

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] finalArr = productExceptSelf(new int[] {1,2,3,4});
        printArray(finalArr);
    }

    private static void printArray(int[] finalArr) {
        for(Integer i:finalArr){
            System.out.print(i+" ");
        }
    }

    public static int[] productExceptSelf(int[] arr){
        int[] newArr = arr.clone();
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i]*arr[i-1];
        }
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[arr.length-1]/newArr[i];
        }
        return newArr;
    }
}
