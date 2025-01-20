package src.SubstringsofSizeThreeDistinctCharacters;

import java.util.HashMap;
import java.util.HashSet;


public class Solution {


    //Time Complexity : O(3*N)
    // Space Complexity : O(3)
    public static int bruteSolution(String s) {
        int count = 0;
        HashSet<Character> hashSet = null;
        for (int i = 0; i < s.length() - 2; i++) {
            hashSet = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                hashSet.add(s.charAt(j));
            }
            if (hashSet.size() == 3) count++;
        }
        return count;
    }

    //TimeComplexity :O(N)
    //SpaceComplexity :O(1)
    public static int betterSolution(String s) {
        if (s == null) return 0;
        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (j = 0; j < 3 && j < s.length(); j++) {
            hashMap.put(s.charAt(j), j);
        }
        if (hashMap.size() == 3) count++;
        while (j < s.length()) {
            Character left = s.charAt(i);
            if (hashMap.get(left) == i) hashMap.remove(left);
            hashMap.put(s.charAt(j), j);
            if (hashMap.size() == 3) count++;
            j++;
            i++;
        }
        return count;

    }

    public static int optimizedSolution(String s) {
        if (s == null || s.length() < 3) {
            return 0;
        }
        int count = 0;
        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);
        for (int i = 3; i < s.length() - 1; i++) {
            if (a != b && b != c && a != c) count++;
            a = b;
            b = c;
            c = s.charAt(i);
        }

        if (a != b && b != c && a != c) count++;

        return count;
    }

    public int countGoodSubstrings(String s) {
        return optimizedSolution(s);
    }
}
