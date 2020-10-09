package LeetCodeHackerRank;

import java.util.*;

public class GroupedAnagrams {
    public static void main(String[] args) {
        String[] strs1 = new String[]{"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = new String[]{""};
        System.out.println(GroupedAnagrams.groupAnagrams(strs1));
        System.out.println(GroupedAnagrams.groupAnagrams(strs2));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String string:strs){
            char[] chrArray = string.toCharArray();
            Arrays.sort(chrArray);
            String result = new String(chrArray);
            if(!map.containsKey(result)){
                map.put(result,new ArrayList<>());
            }
            map.get(result).add(string);
        }
        list.addAll(map.values());
        return list;
    }
}
