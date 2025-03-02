package practiceproblems;

//https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

/*
 * Problem: Sum of All Divisors from 1 to N
 * 
 * Given a number N, the task is to find the sum of all divisors for every number 
 * from 1 to N. Instead of checking divisors for each number individually, we use 
 * a mathematical observation to optimize the process.
 * 
 * Key Insight:
 * -------------
 * Each number 'i' appears as a divisor in all its multiples. Instead of iterating 
 * through each number's divisors, we recognize that 'i' contributes to the sum of 
 * its multiples directly.
 * 
 * Example (N = 10):
 * ------------------
 * The number 2 is a divisor of {2, 4, 6, 8, 10}. Instead of adding 2 separately for 
 * each occurrence, we calculate its total contribution:
 * 
 *      Contribution of 2 = 2 * (N / 2) = 2 * 5 = 10
 * 
 * General Formula:
 * ----------------
 * For each number 'i', it contributes to all its multiples as:
 * 
 *      Contribution of 'i' = i * (N / i)
 * 
 * Here, (N / i) counts how many times 'i' appears as a divisor in numbers from 1 to N.
 * 
 * Time Complexity:
 * ----------------
 * - Instead of O(N²) (checking divisors one by one), this approach runs in O(N).
 * - It iterates from 1 to N, computing each divisor's contribution in constant time.
 * 
 * This is the most efficient approach to solve the problem.
 */




public class sumof1ndivisors_1 {

    public static long sumOfDivisors(int N) {
        long sumDivisors = 0;
        for (int i = 1; i <= N; i++) {
            sumDivisors += (long) i * (N / i);
        }
        return sumDivisors;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(sumOfDivisors(N));

    }
}
