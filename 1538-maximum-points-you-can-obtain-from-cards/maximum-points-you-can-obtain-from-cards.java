class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n =cardPoints.length;
        int sum =0;
        for(int i=0; i<k;i++){
            sum = sum + cardPoints[i];
        }
        int maxsum = sum;

        int l = k-1;
        int r=n-1;
        while(l>=0){
            sum = sum -cardPoints[l];
            sum = sum + cardPoints[r];
            maxsum = Math.max(maxsum , sum);
            l--;
            r--;
    
        }
        return maxsum;
        
    }
}