class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int t) {
        Arrays.sort(a);
        List<List<Integer>> r = new ArrayList<>();
        f(a, t, 0, new ArrayList<>(), r);
        return r;
    }
    void f(int[] a, int t, int i, List<Integer> x, List<List<Integer>> r) {
        if (t == 0) {
            r.add(new ArrayList<>(x));
            return;
        }
        for (int j = i; j < a.length && a[j] <= t; j++) {
            if (j > i && a[j] == a[j - 1]) continue;
            x.add(a[j]);
            f(a, t - a[j], j + 1, x, r);
            x.remove(x.size() - 1);
        }
    }
}
