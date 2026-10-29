class Solution {
    public double myPow(double x, int n) {
        long exp = n;

        if (exp < 0) {
            exp = -exp;
            return 1.0 / fastPow(x, exp);
        }

        return fastPow(x, exp);
    }

    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == 1) {
            return x;
        }

        double half = fastPow(x, n / 2);
        double result = half * half;

        if (n % 2 == 1) {
            result = result * x;
        }

        return result;
    }
}