package LeetCodeHackerRank;

public class StringPermutation {

    // Function to print all the permutations of str
    static void printPermutn(String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String a = str.substring(0, i);
            String b = str.substring(i+1);
            String ros =  a+b;
            printPermutn(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        printPermutn(s, "");
    }
}
