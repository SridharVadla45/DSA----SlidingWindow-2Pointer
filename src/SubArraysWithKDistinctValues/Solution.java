package src.SubArraysWithKDistinctValues;

import java.util.HashMap;

public class Solution {
    public static  int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int i=0;
        int n =nums.length;
        int count =0;
        for(int j=0;j<n;j++){
            int currentValue = nums[j];
            hashMap.put(currentValue,hashMap.getOrDefault(currentValue,0)+1);
            while(hashMap.size()>k){
                int leftValue = nums[i];
                hashMap.put(leftValue,hashMap.get(leftValue)-1);
                if(hashMap.get(leftValue)==0) hashMap.remove(leftValue);
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
}
