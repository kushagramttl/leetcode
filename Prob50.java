public class Prob50 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;
        double current_prod = x;

        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                ans *= current_prod;
            }
            current_prod *= current_prod;
        }

        return ans;
    }
}
