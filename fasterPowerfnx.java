public class fasterPowerfnx {
    public static int fastPow(int a, int b){
        if(b==0)return 1;
        int r = fastPow(a, b/2);
        return b % 2 == 0 ? r*r :r*r*a;
    }
    public static void main (String[] args){
        System.out.println(fastPow(5, 2));
    }

}
