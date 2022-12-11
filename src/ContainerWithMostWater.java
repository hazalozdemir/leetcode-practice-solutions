public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxAreaResult = -1;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int min;
            int width = (j - i);
            if (height[i] < height[j]) {
                min = height[i];
                i++;
            } else {
                min = height[j];
                j--;
            }
            int currentArea = width * min;
            if (currentArea > maxAreaResult) {
                maxAreaResult = currentArea;
            }
        }
        return maxAreaResult;
    }
}
