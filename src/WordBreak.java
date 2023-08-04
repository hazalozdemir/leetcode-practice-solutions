import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        int sLen = s.length();
        boolean[] cache = new boolean[sLen + 1];
        cache[sLen] = true;

        for (int i = sLen - 1; i >= 0; i--) {
            for (String word : wordDict) {
                if ((i + word.length()) <= s.length() && s.startsWith(word, i)) {
                    cache[i] = cache[i + word.length()];
                }
                if (cache[i]) {
                    break;
                }
            }
        }
        return cache[0];

    }


}
