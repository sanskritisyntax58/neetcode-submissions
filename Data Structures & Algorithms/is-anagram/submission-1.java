class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap <Character,Integer> map=new HashMap<>();
    if(s.length()!=t.length())
        return false;
    for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    for(char ch:t.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)-1);
    }
    for(int value:map.values()){
        if(value!=0)
            return false;
    }
            return true;
}
}
