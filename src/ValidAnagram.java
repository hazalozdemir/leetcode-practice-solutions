import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        String sortedS = sortString(s);
        String sortedT = sortString(t);

        if (sortedS.equals(sortedT)) {
            return true;
        }
        return false;

    }

    public String sortString(String input) {
        char[] charArr = input.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);

    }

}
