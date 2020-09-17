import java.util.Arrays;

public class Prob27 {
    public int removeElement(int[] nums, int val) {
        int length = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }

        return length;
    }
}
