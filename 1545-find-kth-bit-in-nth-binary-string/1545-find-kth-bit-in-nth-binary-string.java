
class Solution {
    public char findKthBit(int n, int k) {
        // Base case
        if (n == 1) {
            return '0';
        }

        int mid = 1 << (n - 1);

        // Middle bit is always 1
        if (k == mid) {
            return '1';
        }

        // First half: same position in previous string
        if (k < mid) {
            return findKthBit(n - 1, k);
        }

        // Second half: reverse and invert
        char bit = findKthBit(n - 1, 2 * mid - k);

        return bit == '0' ? '1' : '0';
    }
}
