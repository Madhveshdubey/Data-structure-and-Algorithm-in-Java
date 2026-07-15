public class numberPalindrome {
    public static void main(String[] args) {
        int n = 1259;
        int m = n;
        int rem = 0;
        int rev = 0;
        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Original number is = "+ m);
        System.out.println("Reverse number is = "+ rev);
        if(m == rev){
            System.out.println(m + " is a Palindrome number");
        }
        else{
            System.out.println(m + " is a not a Palindrome number");
        }
    }
}
