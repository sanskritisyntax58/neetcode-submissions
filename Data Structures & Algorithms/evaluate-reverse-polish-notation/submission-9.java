class Solution {
    public int evalRPN(String[] tokens) {
    Stack <Integer> hi=new Stack<>();
    int n,a,b=0;
    for(String c:tokens){
    if(!c.equals("+")&&!c.equals("-")&&!c.equals("/")&&!c.equals("*"))
        hi.push(Integer.parseInt(c));
    else{
    a=hi.pop();
    b=hi.pop();
    if(c.equals("+")){
        n=a+b;
        hi.push(n);
    }
    if(c.equals("*")){
        n=a*b;
        hi.push(n);
    }
    if(c.equals("-")){
        n=b-a;
        hi.push(n);
    }
    if(c.equals("/")){
        n=b/a;
        hi.push(n);
    }
    }
    }
    return hi.pop();
}
}
