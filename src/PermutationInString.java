import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        s1 = sortString(s1);

        for (int i = 0; i <= s2Length - s1Length; i++) {
            String current = s2.substring(i, i + s1Length);
            String sorted = sortString(current);
            if (sorted.equals(s1)) {
                return true;
            }
        }
        return false;

    }

    private static String sortString(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
