package src;

import src.MaxPointsFromCard.Solution;

public class Main {
    public static void main(String[] args) {
        int[] cards = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k =4;
        int maxPoints = Solution.maxPoints(cards,k);
        System.out.println("Maximum points obtained from cards : " + maxPoints);
    }
}
