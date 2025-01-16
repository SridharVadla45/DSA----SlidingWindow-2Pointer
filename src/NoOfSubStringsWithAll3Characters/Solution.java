package src.NoOfSubStringsWithAll3Characters;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static int find(String input ){
        int count =0;
        int n = input.length();
        for(int i=0;i<n;i++){
            HashSet<Character> hashSet = new HashSet<>();
            for(int j=i;j<n;j++){
                hashSet.add(input.charAt(j));
                if(hashSet.size()>=3){
                    count+=n-1-j+1;
                    break;
                }
            }
        }

        return count ;
    }


    public static int findBetter(String input ){
        int count =0;
        int n = input.length();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int j=0;j<n;j++){
            Character currentChar = input.charAt(j);
            hashMap.put(currentChar, j);
            if(hashMap.size()>=3){
                count+=minimum(hashMap)+1;
            }
        }
        return count;

    }


    public static int minimum(HashMap<Character,Integer> hashMap){
        return Math.min(hashMap.get('a'),Math.min(hashMap.get('b'),hashMap.get('c')));
    }
}
