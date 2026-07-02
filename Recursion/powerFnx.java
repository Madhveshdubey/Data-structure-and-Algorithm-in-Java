import java.util.*;
public class powerFnx {
    // ----------Power fnx by loop-------------O(n)
    public static int powerLoop(int a, int b){
        long result  = 1;
        for(int i = 0; i < b; i++){
            result = result * a;
        }
        System.out.println(result);
        return 1;
    }
    // ------------power fnx by recuesion---------O(n)
    public static int powRec(int x, int y){
        if(y == 0) return 1;
        return x* powRec(x, y-1);
    }
    public static void main(String[] args) {

    // --------In- built method of power fnx----------

        // double d = Math.pow(2,5);
        // System.out.println(d);

        powerLoop(2, 5);
        System.out.println(powRec(2, 5));

    }
}
