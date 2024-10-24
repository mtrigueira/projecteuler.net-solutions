package problem.no1to10;

import utils.Palindrome;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem4 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=4
        problem("Largest palindrome product");
        solution(productOfDigits(3));
    }

    public static long productOfDigits(int digits) {
        if (digits<1) throw new RuntimeException("Digits must be greater than 0");
        int highestMultiplier = (int)(Math.pow(10,digits)-1);
        long maxPalindrome = 0;

        for(long i=highestMultiplier; i>0; i--) {
            if (i * i <= maxPalindrome) break;
            for (long j = i; j > 0; j--) {
                if (i * j <= maxPalindrome) break;
                if (Palindrome.isPalindrome(i * j))
                    maxPalindrome = i * j;
            }
        }

        return maxPalindrome;
    }
}
