package LeetCodeHackerRank;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(ValidPalindrome.isPalindrome(s1));
        System.out.println(ValidPalindrome.isPalindrome(s2));
    }
    public static boolean isPalindrome(String s) {
        String result = "";
        for(Character c:s.toCharArray()){
            if(Character.isDigit(c)||Character.isLetter(c)){
                result += c;
            }
        }
        result = result.toLowerCase();
        int start = 0;
        int end = result.length()-1;
        while(start<end){
            if(result.charAt(start)!=result.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
