class Solution {
    public int[] searchRange(int[] a, int t) {
        int l = 0, r = a.length - 1, x = -1, y = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] >= t) r = m - 1;
            else l = m + 1;
        }
        x = l;
        l = 0;
        r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] <= t) l = m + 1;
            else r = m - 1;
        }
        y = r;
        if (x > y) return new int[]{-1, -1};
        return new int[]{x, y};
    }
}
