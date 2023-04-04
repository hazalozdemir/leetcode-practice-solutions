public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int version;
        boolean result = false;
        do {
            version = getHalf(low, high);
            result = isBadVersion(version);
            if (result) {
                high = version;
            } else {
                low = version + 1;

            }
        } while (low < high);

        return low;
    }

    public static int getHalf(int low, int high) {
        return low + (high - low) / 2;
    }

}
