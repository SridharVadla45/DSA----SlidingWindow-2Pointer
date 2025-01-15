package src.LongestSubstringWithAtMostKDistinctCharacters;

import java.util.HashMap;

public class Solution {
    public static  int  findLongestSubStringWithAtMostKDistinctCharacters(String input , int k){
        int Longest =0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int i=0;
        int n=input.length();
        for(int j=0;j<n;j++){
            Character currentChar = input.charAt(j);
            hashMap.put(currentChar,hashMap.getOrDefault(currentChar,0)+1);
            if (hashMap.size()>k){
                Character leftChar = input.charAt(i);
                hashMap.put(leftChar,hashMap.get(leftChar)-1);
                if(hashMap.get(leftChar)==0) hashMap.remove(leftChar);
                i++;
            }
            Longest = Math.max(Longest,j-i+1);

        }
        return  Longest;
    }
}
