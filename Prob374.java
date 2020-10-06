public class Prob374 {

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */

    public int guessNumber(int n) {
        int begin = 0;
        int end = n;

        int mid;
        while (begin <= end) {
            mid = begin + (end - begin) / 2;
            int reply = guess(mid);
            if (reply == 0) return mid;
            if (reply == -1) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
