public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n > 0) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}