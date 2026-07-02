public class towerOfHanoi {
    public static void TOH(int n, int a, int b, int c){
        if (n>0){
            TOH(n-1, a, c, b);
            System.out.println(a+"to"+c);
            TOH(n-1, b, a, c);
        }
    

    }
    public static void main(String[] args) {
        TOH(3, 1, 2, 3);
    }
}
