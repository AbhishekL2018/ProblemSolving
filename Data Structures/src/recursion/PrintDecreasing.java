package recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        recursiveFunction(5);
    }
    public static void recursiveFunction(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        recursiveFunction(n-1);
    }
}
