public class Prob367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long val = num / 2;

        while (val * val > num) {
            val = (val + num / val) / 2;
        }

        return (val * val) == num;
    }
}
