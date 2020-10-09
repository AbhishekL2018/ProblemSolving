package recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        //displayArr(arr,2);
        displayArr(arr,0);
    }
    public static void displayArr(int[] arr, int indx){
        if(indx==arr.length){
            return;
        }
        System.out.println(arr[indx]);
        displayArr(arr,indx+1);
    }
}
