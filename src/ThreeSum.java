import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ) {

            int firstVal = nums[i];
            int remainSum = -firstVal;

            int secondIndex = i + 1;
            int thirdIndex = nums.length - 1;

            while (secondIndex < thirdIndex) {

                if (nums[secondIndex] + nums[thirdIndex] == remainSum) {
                    List<Integer> sumGroup = new ArrayList<>();
                    sumGroup.add(firstVal);
                    sumGroup.add(nums[secondIndex]);
                    sumGroup.add(nums[thirdIndex]);

                    result.add(sumGroup);
                    int temp = nums[secondIndex];
                    while ((temp == nums[secondIndex]) && secondIndex < nums.length - 1) {
                        secondIndex += 1;
                    }

                    temp = nums[thirdIndex];
                    while (temp == nums[thirdIndex] && thirdIndex > 0) {
                        thirdIndex -= 1;
                    }

                } else if (nums[secondIndex] + nums[thirdIndex] < remainSum) {
                    int temp = nums[secondIndex];
                    while (temp == nums[secondIndex] && secondIndex < nums.length - 1) {
                        secondIndex += 1;
                    }
                } else {
                    int temp = nums[thirdIndex];
                    while (temp == nums[thirdIndex] && thirdIndex > 0) {
                        thirdIndex -= 1;
                    }
                }
            }

            while (firstVal == nums[i] && i < nums.length - 2) {
                i++;
            }

        }
        return result;
    }
}



