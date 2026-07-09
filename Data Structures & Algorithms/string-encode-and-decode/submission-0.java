class Solution {

    public String encode(List<String> strs) {
    StringBuilder en= new StringBuilder();
    for(String s:strs){
        int n=s.length();
        en.append(n);
        en.append("#");
        en.append(s);
    }
    String encode=en.toString();
    return encode;
    }

    public List<String> decode(String str) {
    List<String> result= new ArrayList<>();
    int i=0;
    while(i<str.length()){
          int j=str.indexOf('#',i);
          int len=Integer.parseInt(str.substring(i,j));
          String word=str.substring(j+1,j+1+len);
          i=j+1+len;
          result.add(word);
    }
    return result;
    }
}
