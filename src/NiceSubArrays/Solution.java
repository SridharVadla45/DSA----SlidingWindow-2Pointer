package src.NiceSubArrays;

public class Solution {
    public static int findNiceSubArrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int oddcount = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 != 0) oddcount++;
                if (oddcount == k) count++;
            }
        }
        return count;
    }


    public static int findNiceSubArrayBetter(int [] nums ,int k){
        int n = nums.length;
        int count = 0;
        int oddCount=0;
        int i=0;
        for(int j=0;j<n;j++){
            if (nums[j] % 2 != 0) oddCount++;
            while(oddCount>k){
                if (nums[i] % 2 != 0) oddCount--;
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
}
