class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    Stack <Double> s=new Stack<>();
    int n = position.length;
    double[][] cars = new double[n][2];
    for(int i=0; i<n; i++) {
      cars[i][0] = position[i];
      cars[i][1] = speed[i];
    }
    Arrays.sort(cars, (a,b) -> (int)(b[0]-a[0])); 
    for(int i=0;i<position.length;i++){
    double time=(double)(target-cars[i][0])/cars[i][1];
    if(s.isEmpty() || time>s.peek())
      s.push(time);
    }
    return s.size();
}
}