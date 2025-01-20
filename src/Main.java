package src;

import src.MaxPointsFromCard.Solution;

public class Main {
    public static void main(String[] args) {
        int[] cards = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int maxPoints = Solution.maxPoints(cards, k);
        System.out.println("1. Maximum points obtained from cards : " + maxPoints);

        // Longest Substring without repeating characters
        String input = "abcabcbb";
//        String input2="bbbbbb";
        int maxLength = src.LongestSubStringWithoutRepeatingCharacters.Solution.maxLength(input);
        System.out.println("2. max length of substring without repeating characters " + maxLength);

        // Longest SubArray  with consecutive ones after flipping k zeros
        int kflips = 2;
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int maxConsecutiveOnes = src.MaxConsecutiveOnes.Solution.findLengthOfSubArrayWithMaxConsecutive1s(arr, kflips);
        System.out.println("3. Max consecutive length after k flips " + maxConsecutiveOnes);


        // Fruits into Basket
        int[] fruits = {0, 1, 2, 2};
        int maxFruits = src.FruitsIntoBasket.Solution.MaxBasketSize(fruits);
        System.out.println("4. Farmer can collect max fruits : " + maxFruits);


        // LongestSubStringWithAtMost K Distinct characters
        int kdistinct = 2;
        String inputString = "aaabbccd";
        int Longest = src.LongestSubstringWithAtMostKDistinctCharacters.Solution.findLongestSubStringWithAtMostKDistinctCharacters(inputString, kdistinct);
        System.out.println("5. Length of longest substring with at most k distinct characters :" + Longest);


        // No of SubStrings with all three characters
        String input6 = "abcabc";
        int noofsubstrings = src.NoOfSubStringsWithAll3Characters.Solution.findBetter(input6);
        System.out.println("6. NO Of Substrings with all three  characters : " + noofsubstrings);


        // BinarySubArrayWith Sum K
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int totalSubArrays = src.BinarySubArrayWithSumK.Solution.betterSolution(nums, goal) - src.BinarySubArrayWithSumK.Solution.betterSolution(nums, goal - 1);
        System.out.println("7. Total No of sub arrays with sum k : " + totalSubArrays);


        //Nice SubArrays with k odd numbers
        int[] numsOddNumbers = {1, 1, 2, 1, 1};
        int kOddNumbers = 3;
        int TotalOddNumberSubArrays = src.NiceSubArrays.Solution.findNiceSubArrayBetter(numsOddNumbers, kOddNumbers) - src.NiceSubArrays.Solution.findNiceSubArrayBetter(numsOddNumbers, kOddNumbers - 1);
        System.out.println("8. Total No of subarrays with k odd numbers" + TotalOddNumberSubArrays);


        //Subarrays with k distinct values
        int[] numsKdistinct = {1, 2, 1, 2, 3};
        int totalSubarraysWithKdistinct = src.SubArraysWithKDistinctValues.Solution.subarraysWithKDistinct(numsKdistinct, 2) - src.SubArraysWithKDistinctValues.Solution.subarraysWithKDistinct(numsKdistinct, 1);
        System.out.println("9. No of SubArrays with k distinct values : "+totalSubarraysWithKdistinct);

    }
}
