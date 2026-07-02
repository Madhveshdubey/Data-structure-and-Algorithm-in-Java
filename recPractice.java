public class recPractice {
 

public static int a(int n){
    if(n >100)
    {
        return n-10;
    }
   return a(a(n+11));
}
public static void main(String[] args) {
    System.out.println(a(95));
    // System.out.println("hello");
}
}