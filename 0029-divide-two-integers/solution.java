class Solution {
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;
        long x = Math.abs((long)a);
        long y = Math.abs((long)b);
        long ans = 0;
        while (x >= y) {
            long t = y;
            long q = 1;
            while (x >= t + t) {
                t += t;
                q += q;
            }
            x -= t;
            ans += q;
        }
        if ((a < 0) != (b < 0))
            ans = -ans;

        return (int)ans;
    }
}
