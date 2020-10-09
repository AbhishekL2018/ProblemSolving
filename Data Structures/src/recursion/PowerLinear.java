package recursion;

public class PowerLinear {

    public static void main(String[] args) {
        System.out.println(recursiveFunction(2,5));
    }

    public static int recursiveFunction(int x, int n){
        if(n == 0){
            return 1;
        }
        return x*recursiveFunction(x,n-1);
    }
}
