import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbolValues = new HashMap<>();
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);

        int total = symbolValues.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (symbolValues.get(s.charAt(i)) < symbolValues.get(s.charAt(i + 1))) {
                total -= symbolValues.get(s.charAt(i));
            } else {
                total += symbolValues.get(s.charAt(i));
            }
        }
        return total;
    }
}
