import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();
        int max = 0;
        for (int num : nums) {
            numSet.add(num);
        }

        for (int i = 0; i < nums.length; i++) {

            if (!numSet.contains(nums[i] - 1)) {
                //it may be first element of sequence
                int temp = nums[i];
                int consecutiveCounter = 1;
                while (numSet.contains(temp + 1)) {
                    consecutiveCounter += 1;
                    temp += 1;
                }
                if (max < consecutiveCounter) {
                    max = consecutiveCounter;
                }
            }
        }
        return max;
    }
}
