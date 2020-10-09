package LeetCodeHackerRank;

public class AlternateEquilibriumIndexPosition {
    //this is an application for prefix sum algorithm
//{-7,1,5,2,-4,3,0}
//{0, -3, 5, -4, -2, 3, 1, 0}
//{-1,2,2,3,2,2,-1}
// {1,2,6,4,0,-1}
//{12}
//{6,8}
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,6,4,0,-1};
        System.out.println(AlternateEquilibriumIndexPosition.getEquilibriumPoint(arr));
    }
    public static int getEquilibriumPoint(int[] arr) {
        if (arr.length > 2) {
            int[] newArray = arr.clone();

            for(int i=1; i<arr.length; i++){
                arr[i] = arr[i]+arr[i-1];
            }
            for (int j = 1; j < arr.length - 1; j++) {
                int leftSum = arr[j] - newArray[j];
                int rightSum = arr[arr.length-1] - arr[j];
                if (rightSum == leftSum) {
                    return j;
                }
            }

        } else if (arr.length == 1) {
            return 0;
        } else if (arr.length == 2) {
            return -1;
        }
        return -1;
    }

}
