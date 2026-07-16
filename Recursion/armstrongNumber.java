import java.util.*;
public class armstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong Number = ");
        int n = sc.nextInt();
        int count = 0;
        int m = n;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        int rem = 0;
        int sum = 0;
        n = m;
        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, count);
            n = n / 10;
        }
        if(sum == m){
            System.out.println("Yes! "+m+" is an Armstong / Narcissistic Number");
        }
        else{
            System.out.println("NO! "+m+" is not an Armstong / Narcissistic Number");
        }

    }
}
