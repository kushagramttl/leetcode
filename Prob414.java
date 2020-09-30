import java.util.Collections;
import java.util.HashSet;

public class Prob414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        HashSet<Integer> maximums = new HashSet<>();

        for (int item:
                nums) {
            maximums.add(item);

            if (maximums.size() > 3) {
                maximums.remove(Collections.min(maximums));
            }
        }

        if (maximums.size() == 3) {
            return Collections.min(maximums);
        }

        return Collections.max(maximums);
    }
}
