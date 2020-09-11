public class Prob7 {
    public int Reverse(int x) {
        try {

            long reverse = 0;
            while (x != 0) {
                reverse = (reverse * 10) + (x % 10);

                if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
                    return 0;
                }

                x = x / 10;
            }

            return (int) reverse;
        } catch (Exception e) {
            return 0;
        }
    }
}
