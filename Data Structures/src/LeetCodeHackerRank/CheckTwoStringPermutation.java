package LeetCodeHackerRank;

public class CheckTwoStringPermutation {
    public static void main(String[] args) {
        System.out.println(CheckTwoStringPermutation.permutation("cat   "," a c  t"));
    }
    public static boolean permutation(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] charset = new int[256];
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            charset[c]++;
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            charset[c]--;
        }
        for(Integer i:charset){
            if(i!=0) return false;
        }
        return true;
    }
}
