class Solution {
    public int evalRPN(String[] tokens) {
    Stack <Integer> s=new Stack<>();
    for(String ch:tokens){
    if(!ch.equals("+")&&!ch.equals("-")&&!ch.equals("*")&&!ch.equals("/")){
    s.push(Integer.parseInt(ch));}
    else{ 
    int n;
    int a=s.pop();
    int b=s.pop();
    if(ch.equals("+")){
       n=a+b;
       s.push(n);}
    else if(ch.equals("-")){
       n=b-a;
       s.push(n);}
    else if(ch.equals("*")){
       n=a*b;
       s.push(n);}
    else if(ch.equals("/")){
       n=b/a;
       s.push(n);}
    }
    }
    return s.pop();
}
}
