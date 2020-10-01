import java.util.LinkedList;
import java.util.List;

public class Prob448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int new_index = Math.abs(nums[i]) - 1;

            if (nums[new_index] > 0) {
                nums[new_index] *= -1;
            }
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                list.add(i);
            }
        }

        return list;
    }
}
