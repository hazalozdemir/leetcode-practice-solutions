import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static char[][] chars = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'},
            {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() > 0) {
            backtrack(result, "", digits, 0);
        }

        return result;
    }

    public void backtrack(List<String> result, String currStr, String digits, int index) {
        if (currStr.length() == digits.length()) {
            result.add(currStr);
            return;
        }

        int charIndex = digits.charAt(index) - '0';
        for (int i = 0; i < chars[charIndex].length; i++) {
            char currChar = chars[charIndex][i];
            backtrack(result, currStr + currChar, digits, index + 1);
        }

    }
}
