public class index {

    // ---------Head recursion------- it will print at returning time 

    public static void fun(int n){
        if(n > 0){
            fun(n-1);
            System.out.println(n);
        }
    }

    // -----------------Tail Recursion-----------it will print at calling time

    public static void fun1(int n){
        if(n > 0){
            System.out.println(n);
            fun1(n-1);
        }
    }

    // -------tree recursion--------

    public static void fun3(int n){
        if(n<0){
            return ;
        }
            fun3(n-1);
            System.out.print(n + " ");
            fun3(n-3);
            System.out.print(n-1 + " ");
        
    }
    public static void main(String[] args) {
        // fun(3);
        // fun1(3);
        fun3(10);
    }
}
