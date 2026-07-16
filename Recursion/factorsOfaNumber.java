public class factorsOfaNumber {
    public static int printfactors(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        printfactors(9);
    }
}
