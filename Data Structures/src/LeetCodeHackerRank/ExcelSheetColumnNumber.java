package LeetCodeHackerRank;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(ExcelSheetColumnNumber.giveNumber("ZY"));
    }
    public static int giveNumber(String s){
        int count = 0;
        int length = s.length();
        for(int i=0; i<length; i++){
            count += ((int)s.charAt(i)-64)*Math.pow(26,length-1-i);
        }
        return count;
    }
}
