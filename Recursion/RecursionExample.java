public class RecursionExample {
    
    static void A(int n) {
        if (n < 1) {
            return;
        } else {
            System.out.print(n - 3+" "); 
            A(n - 1);                     
            System.out.print(n - 1 +" "); 
            A(n - 2);                     
            System.out.print(n +" "); 
            A(n - 3);                     
            System.out.print(n - 2+" "); 
        }
    }
    
    public static void main(String[] args) {
        A(5);   
    }
}