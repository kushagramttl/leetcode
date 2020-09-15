public class Prob88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = nums1.length - 1;
        m--;
        n--;
        while (last >= 0) {
            if (m < 0) nums1[last] = nums2[n--];
            else if (n < 0) nums1[last] = nums1[m--];
            else if (nums1[m] > nums2[n]) nums1[last] = nums1[m--];
            else nums1[last] = nums2[n--];

            last--;
        }
    }
}
