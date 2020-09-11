import java.util.Arrays;

public class MaxConsOnesI {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0)
            return -1;

        boolean any_ones = Arrays.stream(nums).anyMatch(x -> x == 1);

        if (!any_ones) {
            return 0;
        }

        int max_length = Integer.MIN_VALUE;

        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                int j = i + 1;
                while (j < nums.length && nums[j] == 1) {
                    j++;
                }
                max_length = Math.max(max_length, j - i);
                i = j;
            } else {
                while (i < nums.length && nums[i] == 0) {
                    i++;
                }
            }
        }

        return max_length;
    }

}
