package recursion;

public class PrintIncreasing {
    public static void main(String[] args) {
        recursiveFunction(5);
    }

    public static void recursiveFunction(int n){
        if(n == 0){
            return;
        }
        recursiveFunction(n-1);
        System.out.println(n);
    }
}
