package src.FruitsIntoBasket;

import java.util.HashMap;


public class Solution {
     public static int MaxBasketSize(int [] fruits){
         HashMap<Integer,Integer> hashmap = new HashMap();
         int n = fruits.length;
         int i=0;
         int maxCount =0;
         for(int j =0;j<n;j++){
             hashmap.put(fruits[j],hashmap.getOrDefault(fruits[j],1)+1);
             while (hashmap.size()>2){
                 hashmap.put(fruits[i], hashmap.get(fruits[i])-1);
                 if(hashmap.get(fruits[i])==0) hashmap.remove(fruits[i]);
                 i++;
             }
             maxCount=Math.max(maxCount, j-i+1);
         }

         return maxCount;
     }
}
