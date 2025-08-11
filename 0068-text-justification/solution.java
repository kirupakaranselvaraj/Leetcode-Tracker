class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int len = words[i].length();
            int j = i + 1;
            while (j < words.length && len + 1 + words[j].length() <= maxWidth) {
                len += 1 + words[j].length();
                j++;
            }
            StringBuilder line = new StringBuilder();
            int numWords = j - i;
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" ");
            } else {
                int totalSpaces = maxWidth - (len - (numWords - 1));
                int spaceBetween = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < spaceBetween + (k - i < extraSpaces ? 1 : 0); s++) {
                            line.append(" ");
                        }
                    }
                }
            }
            res.add(line.toString());
            i = j;
        }
        return res;
    }
}

