class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true; // 2^0 = 1
        }
        if (n <= 0 || n % 2 != 0) {
            return false; // Non-positive or odd numbers cannot be powers of two
        }
        return isPowerOfTwo(n / 2);
    }
}
