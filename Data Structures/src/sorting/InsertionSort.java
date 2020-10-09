package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,2,4,9,0,1,2,14,3,7,100,0,-1,-5,6,25};
        int temp1,temp2;
        for(int i=1; i<numbers.length; i++) {
            temp1 = numbers[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp1 < numbers[j]) {
                    temp2 = numbers[j];
                    numbers[j] = temp1;
                    numbers[j+1] = temp2;
                } else {
                    break;
                }
            }
        }
        for(Integer num:numbers){
            System.out.print(num+" ");
        }
    }
}
