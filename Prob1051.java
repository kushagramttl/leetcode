import java.util.Arrays;

public class Prob1051 {
    public int heightChecker(int[] heights) {
        if (heights.length == 1) {
            return 1;
        }

        int[] heights_dupl = heights.clone();
        Arrays.sort(heights);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != heights_dupl[i]) {
                count++;
            }
        }

        return count;

    }
}
