class Solution {
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]>pq=new PriorityQueue<>(
    (a,b)->{int ad=a[0]*a[0]+a[1]*a[1];
           int bd=b[0]*b[0]+b[1]*b[1];
           return Integer.compare(bd,ad);}
    );
    for(int[] i:points){
    pq.add(i);
    if(pq.size()>k)pq.poll();
    }
    int[][] result=new int[k][2];
    while(k>0){
    result[--k]=pq.poll();
    }
    return result;
    }
}
