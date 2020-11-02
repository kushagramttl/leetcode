public class Prob278 {
    private boolean isBadVersion(int version) {
        return true;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int last = n;
        while (start < last) {
            int mid = start + (last - start) / 2;

            if (isBadVersion(mid)) {
                last = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
