public class gaussSummation {

    // ------------Simple statement----------------time O(1)

    // public static int sum(int n){
    //     System.out.println(n*(n+1)/2); 
    //     return 1;
    // }  

    // ---------------By Loop-------------------------time O(n)

    // public static int sumLoop(int n){
    //      int sum  = 0;
    //     for (int i = 0; i <= n; i++){
    //         sum +=i;
    //     }
    //     System.out.println(sum);
    //     return 1;
    // }

    // ----------By Recursion-----------------time O(n)

    public static int sumRec(int n){
        if(n == 0){
            return 0;
        }
         return n+sumRec(n-1);
    }
    public static void main(String[] args) {
        // sum(100);
        // sumLoop(100);
        System.out.println(sumRec(100));
       
    }
}
