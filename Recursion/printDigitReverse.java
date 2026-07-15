public class printDigitReverse {
    public static void main(String[] args) {
        // int n = 1259;
        // int rem = 0;
        // while(n > 0 ){
        //     rem = n % 10;
        //     System.out.print(rem);
        //     n = n / 10;
        // }
        int n = 1234567890;
        int count = 0;
        int rem = 0;
        while(n > 0 ){
            rem = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
