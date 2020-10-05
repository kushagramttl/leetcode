public class Prob704 {
    public int search(int[] nums, int target) {
        int begin = 0;
        int last = nums.length - 1;
        int mid;
        while (begin <= last) {
            mid = begin + (last - begin) / 2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid]) {
                last = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
