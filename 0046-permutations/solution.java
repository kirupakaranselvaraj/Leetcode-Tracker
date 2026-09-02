class Solution {
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> r = new ArrayList<>();
        f(a, 0, r);
        return r;
    }
    void f(int[] a, int i, List<List<Integer>> r) {
        if (i == a.length) {
            List<Integer> x = new ArrayList<>();
            for (int n : a) x.add(n);
            r.add(x);
            return;
        }
        for (int j = i; j < a.length; j++) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            f(a, i + 1, r);
            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
