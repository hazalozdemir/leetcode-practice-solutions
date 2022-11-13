import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if (anagramGroups.containsKey(sortedString)) {
                List<String> anagramGroup = anagramGroups.get(sortedString);
                anagramGroup.add(s);
            } else {
                List<String> anagramGroup = new ArrayList();
                anagramGroup.add(s);
                result.add(anagramGroup);

                anagramGroups.put(sortedString, anagramGroup);
            }
        }

        return result;

    }
}

