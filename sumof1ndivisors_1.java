package practiceproblems;

//https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1




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
