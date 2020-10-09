package LeetCodeHackerRank;

public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        FindMaximumAndMinimum.getMaxMin(
                new int[]{9,-6,0,10,5,8,-10,15}
        );
    }

    private static void getMaxMin(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for(int i=0; i<ints.length; i++){
            /*if(ints[i]>max){
                max = ints[i];
            }
            if(ints[i]<min){
                min = ints[i];
            }*/
            max = Math.max(max,ints[i]);
            min = Math.min(min,ints[i]);
        }
        System.out.println("max --> "+max+" and min --> "+min);
    }

}
