package LeetCodeHackerRank;

public class AlternateArrayRearrange {
    public static void main(String[] args) {
        int[] newArray = AlternateArrayRearrange.reArrange(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        for (Integer i : newArray) {
            System.out.println(i);
        }
    }

    public static int[] reArrange(int[] arr) {
        int[] newArray = new int[arr.length];
        int r = arr.length - 1;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                newArray[i] = arr[r];
                r--;
            } else {
                newArray[i] = arr[l];
                l++;
            }
        }
        return newArray;
    }
}
