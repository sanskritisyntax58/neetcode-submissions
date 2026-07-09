class MinStack {
    Stack <Integer> minStack=new Stack<>();
    Stack <Integer> min=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        minStack.push(val);
        if(min.isEmpty())min.push(val);
        else{
        int mini=Math.min(val,min.peek());
        min.push(mini);
        }
    }
    
    public void pop() {
        minStack.pop();
        min.pop();
    }
    
    public int top() {
        int m=minStack.peek();
        return m;
    }
    
    public int getMin() {
        int mm=min.peek();
        return mm;
    }
}
