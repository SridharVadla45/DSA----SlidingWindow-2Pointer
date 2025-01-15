package src.LongestSubStringWithoutRepeatingCharacters;

import java.util.HashMap;

public class Solution {
    public static int maxLength(String input){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int i=0,j=0;
        int maxsum =0;
        int n = input.length();
        while(j<n){
            Character c = input.charAt(j);
            if(!hashMap.containsKey(c) || hashMap.get(c)==0)hashMap.put(c,1);
            else{
                while (hashMap.get(c)>0){
                    Character c1 = input.charAt(i);
                    hashMap.put(c1, hashMap.get(c1)-1);
                    i++;
                }
                hashMap.put(c,1);
            }
            maxsum=Math.max(maxsum,j-i+1);
            j++;
        }


        return maxsum;
    }
}
