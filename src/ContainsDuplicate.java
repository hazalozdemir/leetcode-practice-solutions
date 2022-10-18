import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> elementSet = new HashSet<>();

        for (int i : nums) {
            if (elementSet.contains(i)) {
                return true;
            }
            elementSet.add(i);
        }
        return false;
    }
}
