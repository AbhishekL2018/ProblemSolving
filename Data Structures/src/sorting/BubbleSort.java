package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{23,-9,5,7,100,14,63,0,-100,2};
        int temp,flag;
        for(int i=0; i<numbers.length; i++){
            flag = 0;
            for(int j=0; j<numbers.length-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(Integer num:numbers){
            System.out.print(num+" ");
        }
    }
}
