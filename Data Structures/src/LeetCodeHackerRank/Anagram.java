package LeetCodeHackerRank;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(Anagram.isAnagram("anagram","nagaram"));
        System.out.println(Anagram.isAnagram("car","rac"));
        System.out.println(Anagram.isAnagram("cat","rac"));
        System.out.println(Anagram.isAnagram("a","ab"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';
            arr[index] += 1;
        }
        t = t.toLowerCase();
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            int index = c - 'a';
            arr[index] -= 1;
        }
        for(Integer i:arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
