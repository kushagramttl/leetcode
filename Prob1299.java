public class Prob1299 {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];

        arr[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            int val = arr[i];
            arr[i] = max;
            max = Math.max(val, max);
        }

        return arr;
    }
}
