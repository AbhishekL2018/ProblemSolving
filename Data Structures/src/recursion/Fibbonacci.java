package recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(recursiveFunction(8));
    }
    public static int recursiveFunction(int x){
        if(x == 0 || x == 1) {
            return x;
        }
        return recursiveFunction(x-1)+recursiveFunction(x-2);
    }
}
