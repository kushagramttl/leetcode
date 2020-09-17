import java.util.HashSet;

public class Prob1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i :
                arr) {
            if (i == 0 && set.contains(0)) {
                return true;
            }
            else if (set.contains(2 * i) || ((i % 2 == 0) && (set.contains(i / 2)))) {
                return true;
            }
            set.add(i);
        }

        return false;
    }
}
