public class Multiples {
    public static void main(String[] args) {
        // Program to see how many multiples of 3 or 5 are there below 1000
        int i = 1;
        int sum = 0;
        while (i <= 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += 1;
            }
            i++;
        }
        System.out.println(sum);
    }
}
