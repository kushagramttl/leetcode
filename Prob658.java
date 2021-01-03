import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prob658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = null;
        if (x < arr[0]) {
            result = new ArrayList<>();
            for (int i = 0; i < k && i < arr.length; i++) {
                result.add((Integer) arr[i]);
            }
        } else if (arr[arr.length - 1] <= x) {
            result = new ArrayList<>();
            int start = arr.length - k;
            if (arr.length - k < 0)
                start = 0;
            for (int i = start; i < arr.length; i++) {
                result.add((Integer) arr[i]);
            }
        } else {
            int index = Arrays.binarySearch(arr, x);
            if (index < 0) {
                index = -index - 1;
            }

            int low = Math.min(0, index - k - 1);
            int high = Math.min(arr.length - 1, index + k - 1);

            while (high - low > k - 1) {
                if (low < 0 || (x - arr[low]) > (arr[high]) - x)
                    low++;
                else
                    high--;

            }

            result = new ArrayList<>();
            for (int i = low; i <= high; i++) {
                result.add((Integer) arr[i]);
            }
        }

        return result;
    }
}
