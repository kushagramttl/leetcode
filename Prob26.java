public class Prob26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int length = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[length]) {
                length++;
                nums[length] = nums[j];
            }
        }

        return length + 1;
    }
}
