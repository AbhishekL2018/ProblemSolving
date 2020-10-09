package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrwquency {
    public static void main(String[] args) {
        System.out.println(SortCharactersByFrwquency.frequencySort("mississipi"));
    }
    public static String frequencySort(String s) {
        List<Character>[] list = new List[s.length()+1];
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        for (Map.Entry<Character,Integer> set : map.entrySet()) {
            int index = set.getValue();
            if(null == list[index]){
                list[index] = new ArrayList<>();
            }
            list[index].add(set.getKey());
        }
        for(int i=list.length-1; i>=0; i--){
            if(list[i]!=null){
                for(Character j:list[i]){
                    result.append(String.valueOf(j).repeat(i));
                }
            }
        }
        return result.toString();
    }
}
