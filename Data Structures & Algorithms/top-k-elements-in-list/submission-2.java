class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap <Integer,Integer> map=new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }
    ArrayList <Integer> key=new ArrayList<>(map.keySet());
    Collections.sort(key,(a,b)-> Integer.compare(map.get(b),map.get(a)));
    int[] ans=new int[k];
    for(int i=0;i<k;i++){
        ans[i]=key.get(i);
    }
    return ans;
}
}