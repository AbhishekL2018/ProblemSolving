package recursion;

public class PrintArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        //displayreverseArray(arr,4);
        displayreverseArray(arr,2);
    }
    public static void displayreverseArray(int[] arr, int indx){
        if(indx == -1){
            return;
        }
        System.out.println(arr[indx]);
        displayreverseArray(arr,indx-1);
    }
}
