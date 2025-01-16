package src.BinarySubArrayWithSumK;

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int n = nums.length;
       int count =0;
       for(int i=0;i<n;i++){
           int sum =0;
           for(int j=i;j<n;j++){
               sum+=nums[j];
               if(sum==goal) count++;
           }
       }
       return count;
    }


    public static  int betterSolution(int [] nums ,int goal){
        if(goal <0) return 0;
        int n= nums.length;
        int count=0;
        int sum =0;
        int i=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
}
