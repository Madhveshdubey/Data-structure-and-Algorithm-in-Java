public class Memoization {

   public static int F[];

   public static int fib(int n) {
        if(n <= 1) return n;
        if(F[n-2] == -1)
        F[n-2] = fib(n-2);
        if(F[n-1] == -1)
        F[n-1] = fib(n-1);
        return F[n-2]+ F[n-1];

    }

    public static void main(String[] args) {
        F= new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        System.out.println("Memoization's Fibonacci "+ fib(8));
    }
}