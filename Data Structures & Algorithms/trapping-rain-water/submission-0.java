class Solution {
    public int trap(int[] height) {
    int ans=0;
    int n=height.length;
    for(int i=1;i<=n-2;i++){
        int lmax=0;
        for(int j=i;j>=0;j--){
        lmax=Math.max(lmax,height[j]);
        }
        int rmax=0;
        for(int j=i;j<n;j++)
        rmax=Math.max(rmax,height[j]);
    if(height[i]<lmax&&height[i]<rmax)
        ans=ans+Math.min(lmax,rmax)-height[i];
    }
    return ans;
    }
}

