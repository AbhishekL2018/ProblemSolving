package recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5,50,101,100,69};
        //System.out.println(maxOfArray(arr,3));
        System.out.println(maxOfArray(arr,0));
    }
    public static int maxOfArray(int[] arr, int indx){
        if(indx == arr.length - 1){
            return arr[indx];
        }
        int max = maxOfArray(arr,indx+1);
        if(arr[indx] < max){
            return max;
        }else{
            return arr[indx];
        }
    }
}
