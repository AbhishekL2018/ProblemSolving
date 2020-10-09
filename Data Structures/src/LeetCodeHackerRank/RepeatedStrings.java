package LeetCodeHackerRank;

public class RepeatedStrings {
    public static void main(String[] args) {
        System.out.println(repeatedString("aabc",4));
    }
    public static int repeatedString(String s, int n){
        int totalString = n/s.length();
        int remainder = n%s.length();
        return totalString*getLetterCount(s,s.length())+getLetterCount(s,remainder);
    }
    private static int getLetterCount(String s, int count){
        int sum = 0;
        for(int i=0; i<count; i++){
            if(s.charAt(i)=='a'){
                sum++;
            }
        }
        return sum;
    }
}
