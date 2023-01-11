import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            int counter = 1;
            charSet.add(s.charAt(i));
            int j = i+1;
            while(j < s.length() && !charSet.contains(s.charAt(j))){
                counter+=1;
                charSet.add(s.charAt(j));
                j+=1;

            }
            if(maxLength < counter){
                maxLength = counter;
            }
            charSet.clear();
        }
        return maxLength;
    }

}
