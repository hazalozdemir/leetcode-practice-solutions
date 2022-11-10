import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                result[0] = numsMap.get(nums[i]);
                result[1] = i;
                break;
            }
            numsMap.put(target - nums[i], i);
        }
        return result;
    }
}

