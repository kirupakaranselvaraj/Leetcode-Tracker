class Solution {
    public int hIndex(int[] citations) {
        int l = 0, r = citations.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (citations[m] >= citations.length - m)
                r = m - 1;
            else
                l = m + 1;
        }
        return citations.length - l;
    }
}
