public class logarithmicFnc {
    // ----------log fnx by loop-----O(log n)
    // public static int log(int a, int b){
    //   int count = 0;
    //   while(a > 1){
    //     a = a/b;
    //     count++;
    //   }
    //   return count;
    // }

    // ------------------log fnx by rec--------O(log n)
    public static int logRec(int n, int a){
        if(n<a)return 0;
        return 1+logRec(n/a,a);
    }
    public static void main(String[] args) {
        // System.out.println(log(32, 2));
        System.out.println(logRec(4, 2));
    }
}
