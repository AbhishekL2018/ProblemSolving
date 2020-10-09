package recursion;

public class PowerLinearLogarithmic {
    public static void main(String[] args) {
        System.out.println(recurssiveFunction(10,8));
    }
    public static int recurssiveFunction(int x, int n){
        if(n == 0){
            return 1;
        }
        int value = recurssiveFunction(x,n/2);
        int result = value*value;
        if(n%2 == 1){
            return result*x;
        }
        return result;
    }
}
