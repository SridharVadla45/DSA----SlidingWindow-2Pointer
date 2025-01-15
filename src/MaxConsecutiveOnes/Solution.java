package src.MaxConsecutiveOnes;

public class Solution {
    public static  int findLengthOfSubArrayWithMaxConsecutive1s(int [] arr,int k ){
        int maxLength=0;
        int i=0;
        int temp =k;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0) temp--;
            if(temp<0){
              if(arr[i]==0)temp++;
              i++;
            }
            maxLength=Math.max(j-i+1,maxLength);
        }
        return maxLength ;
   }
}
