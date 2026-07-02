public class fibonacci {
    static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        long n = 6;
        System.out.println("Fibonacci series up to " + n + ":");
        System.out.println(fib(6));
        // for (long i = 0; i < n; i++) {
        //     System.out.print(fib(i) + " ");
        // }
}
}