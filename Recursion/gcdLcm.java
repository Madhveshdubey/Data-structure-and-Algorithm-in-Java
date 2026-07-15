public class gcdLcm {
    public static int printlcm(int a, int b){
        return (a*b)/printgcd(a, b);
    }
    public static int printgcd(int a, int b){
        while(a != b){
            if(a > b)
                return a-b;
            if(b > a){
                return b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(printgcd(9, 6));
        // System.out.println(printlcm(24,36));
    }
}
