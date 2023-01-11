import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    /*    public int lengthOfLongestSubstring(String s) {
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
        }*/
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int firstPointer = 0;
        int secondPointer = 0;


        while (secondPointer < s.length()) {

            if (!charSet.contains(s.charAt(secondPointer))) {
                charSet.add(s.charAt(secondPointer));
                secondPointer += 1;
                maxLength = Math.max(maxLength, charSet.size());
            } else {
                charSet.remove(s.charAt(firstPointer));
                firstPointer += 1;
            }
        }

        return maxLength;
    }
}
