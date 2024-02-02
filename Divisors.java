public class Divisors {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        for (int d = 1; d <= num; d++) {
            if (num % d == 0) {
                System.out.println(d + " ");
            }
        }
        

    }
}
