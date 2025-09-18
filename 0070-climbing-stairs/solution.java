class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int twoStepsBack = 1;
        int oneStepBack = 2;

        for (int i = 3; i <= n; i++) {
            int currentWays = oneStepBack + twoStepsBack;
            twoStepsBack = oneStepBack;
            oneStepBack = currentWays;
        }

        return oneStepBack;
    }
}
