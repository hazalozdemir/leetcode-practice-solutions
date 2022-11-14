import java.util.*;


public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> counterMap = new HashMap<>();

        for (int num : nums) {
            int counter = counterMap.getOrDefault(num, 0);
            counterMap.put(num, counter + 1);
        }

        return counterMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue()
                .reversed()).limit(k).mapToInt(entry -> entry.getKey()).toArray();
    }
}
