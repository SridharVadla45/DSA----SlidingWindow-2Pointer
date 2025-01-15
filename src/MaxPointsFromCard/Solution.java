package src.MaxPointsFromCard;

public class Solution {
    public static int maxPoints(int [] cards,int k ){
        int maxSum =0;
        int sum =0;
        for(int i=0;i<k;i++){
         sum+=cards[i];
         maxSum=Math.max(sum,maxSum);
        }
        int j = cards.length-1;
        for(int i=k-1;i>=0;i--){
            sum-=cards[i];
            sum+=cards[j];
            maxSum=Math.max(sum,maxSum);
            j--;
        }

        return maxSum;
    }
}
