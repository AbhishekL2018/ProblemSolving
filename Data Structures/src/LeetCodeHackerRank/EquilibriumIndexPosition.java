package LeetCodeHackerRank;


///this is an application for prefix sum algorithm
//{-7,1,5,2,-4,3,0}
//{0, -3, 5, -4, -2, 3, 1, 0}
//{-1,2,2,3,2,2,-1}
//{12}
//{6,8}

public class EquilibriumIndexPosition {

    public static void main(String[] args) {

        int[] arr = new int[]{-7,1,5,2,-4,3,0};
            System.out.println(EquilibriumIndexPosition.calculateEquilibriumPoint(arr));
    }

    public static int calculateEquilibriumPoint(int[] arr) {
        if (arr.length > 2) {
            int toltalSum = 0;
            int leftSum = arr[0];
            for (int i = 0; i < arr.length; i++) {
                toltalSum += arr[i];
            }
            for (int j = 1; j < arr.length - 1; j++) {
                int rightSum = toltalSum - arr[j] - leftSum;
                if (rightSum == leftSum) {
                    return j;
                }
                leftSum += arr[j];
            }
        } else if (arr.length == 1) {
            return 0;
        } else if (arr.length == 2) {
            return -1;
        }
        return -1;
    }
}
