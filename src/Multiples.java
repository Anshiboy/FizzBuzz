public class Multiples {
    public static int main(int n, int a, int b) {
        // Program to see how many multiples of 3 or 5 are there below 1000
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (i % a == 0 || i % b == 0) {
                sum += 1;
            }
            i++;
        }
        return i;
    }
}
