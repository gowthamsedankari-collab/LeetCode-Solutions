import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<=t.length()-1;i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
       if(map1.equals(map2)){
        return true;
       }
        return false;
    }
}