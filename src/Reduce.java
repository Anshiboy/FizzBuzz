public class Reduce {
    public static void main(String[] args) {
        // Program to reduce number to 0 by dividing by 2 if even, and subtracting 1 if odd
        int i = 100;
        int steps = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i -= 1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
