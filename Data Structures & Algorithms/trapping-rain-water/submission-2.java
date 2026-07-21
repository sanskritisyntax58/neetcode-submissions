class Solution {
    public int trap(int[] height) {
    Stack <Integer> hi=new Stack<>();
    int ans=0;
    for(int r=0;r<height.length;r++){
    while(!hi.empty()&&height[r]>height[hi.peek()]){
    int curr=hi.peek();
    hi.pop();
    if(hi.empty())break;
    int l=hi.peek();
    int distance=r-l-1;
    int curr_height=Math.min(height[l],height[r])-height[curr];
    ans+=distance*curr_height;
    }
    hi.push(r);
    }
    return ans;
    }
}

