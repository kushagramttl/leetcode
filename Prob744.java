public class Prob744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        if (target < letters[0]) {
            return letters[0];
        }

        int mid = 0;
        int left = 0, right = letters.length;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (letters[mid] <= target) left = mid + 1;
            else
                right = mid;
        }

        return letters[left % letters.length];
    }
}
