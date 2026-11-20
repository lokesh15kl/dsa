class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long left = 0, right = a, res = 0;

        while (left <= right) {
            long mid = left + ((right - left) >> 1);

            if (multiply(mid, b) <= a) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            res = -res;
        }

        return (int) res;
    }

    private long multiply(long x, long y) {
        long res = 0;

        while (x > 0) {
            if ((x & 1) == 1) {
                res += y;
            }

            y <<= 1;
            x >>= 1;
        }

        return res;
    }
}