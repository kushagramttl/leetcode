import java.util.Arrays;

public class Prob1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n: nums) {
            String str = Integer.toString(n);
            if (str.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
