public class Prob1089 {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        int max_length = arr.length - 1;

        for (int left = 0; left < arr.length - zeros; left++) {
            if (arr[left] == 0) {
                if (left == max_length - zeros) {
                    arr[max_length] = 0;
                    max_length -= 1;
                    break;
                }

                zeros++;
            }
        }

        int last = max_length - zeros;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}
